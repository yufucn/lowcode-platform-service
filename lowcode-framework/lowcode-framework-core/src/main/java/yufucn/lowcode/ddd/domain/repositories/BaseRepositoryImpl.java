package yufucn.lowcode.ddd.domain.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import yufucn.lowcode.data.DataFilterService;
import yufucn.lowcode.ddd.domain.entities.auditing.FullAuditedEntity;
import yufucn.lowcode.ddd.domain.entities.auditing.SoftDelete;
import yufucn.lowcode.ddd.domain.specification.ByIdSpecification;
import yufucn.lowcode.ddd.domain.specification.SoftDeletedSpecification;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.Optional;

/**
 * @author wang
 * @date 2023/5/24 21:17
 */
public class BaseRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> {
    private final JpaEntityInformation<T, ?> entityInformation;

    private DataFilterService dataFilterService;

    public BaseRepositoryImpl(
            JpaEntityInformation<T, ?> entityInformation,
            EntityManager entityManager,
            DataFilterService dataFilterService) {
        super(entityInformation, entityManager);
        this.entityInformation = entityInformation;
        this.dataFilterService = dataFilterService;
    }

    @Override
    public long count() {
        return super.count(softDeleted());
    }

    @Override
    public void delete(T entity) {
        if (entity instanceof SoftDelete) {
            ((SoftDelete) entity).setDeleted(1);
            super.save(entity);
        } else {
            super.delete(entity);
        }

    }

    @Override
    public Optional<T> findById(ID id) {
        return super.findOne(Specification.where(new ByIdSpecification<>(entityInformation, id)));
    }

    @Override
    protected <S extends T> TypedQuery<Long> getCountQuery(Specification<S> spec, Class<S> domainClass) {
        if (dataFilterService.enabled(SoftDelete.class) &&
                SoftDelete.class.isAssignableFrom(domainClass)) {
            if (spec == null) {
                spec = softDeleted();
            } else {
                spec = spec.and(softDeleted());
            }
        }
        return super.getCountQuery(spec, domainClass);
    }

    @Override
    protected <S extends T> TypedQuery<S> getQuery(Specification<S> spec, Class<S> domainClass, Sort sort) {
        if (dataFilterService.enabled(SoftDelete.class) &&
                SoftDelete.class.isAssignableFrom(domainClass)) {
            if (spec == null) {
                spec = softDeleted();
            } else {
                spec = spec.and(softDeleted());
            }
        }
        return super.getQuery(spec, domainClass, sort);
    }

    private static <T> Specification<T> softDeleted() {
        return Specification.where(new SoftDeletedSpecification<>());
    }
}
