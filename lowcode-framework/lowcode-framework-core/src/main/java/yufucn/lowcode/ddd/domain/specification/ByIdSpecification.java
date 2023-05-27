package yufucn.lowcode.ddd.domain.specification;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Objects;

/**
 * @author wang
 * @date 2023/5/24 21:11
 */
public class ByIdSpecification<T, ID> implements Specification<T> {

    private static final long serialVersionUID = 6523470832851906115L;
    private final transient JpaEntityInformation<T, ?> entityInformation;
    private final transient ID id;

    public ByIdSpecification(JpaEntityInformation<T, ?> entityInformation, ID id) {
        this.entityInformation = entityInformation;
        this.id = id;
    }

    @Override
    public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        return cb.equal(root.<ID>get(Objects.requireNonNull(entityInformation.getIdAttribute()).getName()), id);
    }
}