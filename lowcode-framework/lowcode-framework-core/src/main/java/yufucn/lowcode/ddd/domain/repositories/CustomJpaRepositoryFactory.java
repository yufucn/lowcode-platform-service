package yufucn.lowcode.ddd.domain.repositories;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.util.Assert;
import yufucn.lowcode.data.DataFilterService;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * @author wang
 * @date 2023/5/27 22:11
 */
public class CustomJpaRepositoryFactory extends JpaRepositoryFactory {

    private DataFilterService dataFilterService;


    public CustomJpaRepositoryFactory(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected JpaRepositoryImplementation<?, ?> getTargetRepository(RepositoryInformation information, EntityManager entityManager) {
        JpaEntityInformation<?, Serializable> entityInformation = this.getEntityInformation(information.getDomainType());
        Object repository = this.getTargetRepositoryViaReflection(information,
                new Object[]{entityInformation, entityManager, dataFilterService});
        Assert.isInstanceOf(BaseRepositoryImpl.class, repository);
        return (JpaRepositoryImplementation) repository;
    }

    @Override
    protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
        return BaseRepositoryImpl.class;
    }

    public DataFilterService getDataFilterService() {
        return dataFilterService;
    }

    public void setDataFilterService(DataFilterService dataFilterService) {
        this.dataFilterService = dataFilterService;
    }
}
