package yufucn.lowcode.ddd.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;
import org.springframework.util.Assert;
import yufucn.lowcode.data.DataFilterService;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * @author wang
 * @date 2023/5/24 21:28
 */
public class CustomJpaRepositoryFactoryBean<T extends JpaRepository<S, ID>, S, ID extends Serializable>
        extends JpaRepositoryFactoryBean<T, S, ID> {
    private final DataFilterService dataFilterService;

    public CustomJpaRepositoryFactoryBean(Class<? extends T> repositoryInterface,
                                          DataFilterService dataFilterService) {
        super(repositoryInterface);
        this.dataFilterService = dataFilterService;
    }

    @Override
    protected RepositoryFactorySupport createRepositoryFactory(EntityManager entityManager) {
        CustomJpaRepositoryFactory factory = new CustomJpaRepositoryFactory(entityManager);
        factory.setDataFilterService(dataFilterService);
        return factory;
    }

//    private static class CustomJpaRepositoryFactory<T, ID extends Serializable> extends JpaRepositoryFactory {
//
//        private final EntityManager entityManager;
//
//        CustomJpaRepositoryFactory(EntityManager entityManager) {
//            super(entityManager);
//            this.entityManager = entityManager;
//        }
//
//        @Override
//        protected JpaRepositoryImplementation<?, ?> getTargetRepository(RepositoryInformation information, EntityManager entityManager) {
//            JpaEntityInformation<?, Serializable> entityInformation = this.getEntityInformation(information.getDomainType());
//            Object repository = this.getTargetRepositoryViaReflection(information, new Object[]{entityInformation, entityManager});
//            Assert.isInstanceOf(BaseRepositoryImpl.class, repository);
//            return (JpaRepositoryImplementation)repository;
//        }
//
//        @Override
//        protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
//            return BaseRepositoryImpl.class;
//        }
//    }

}
