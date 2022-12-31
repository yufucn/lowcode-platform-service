package yufucn.lowcode.daas.application;

import org.springframework.data.jpa.domain.Specification;
import yufucn.lowcode.daas.domain.datasource.DataSource;
import yufucn.lowcode.daas.domain.datasource.DataSourceRepository;
import yufucn.lowcode.ddd.application.services.CrudAppService;

/**
 * @author wang
 * @date 2023/1/1 0:08
 */
public class DataSourceAppService  extends CrudAppService<
        DataSource,
        DataSource,
        DataSource,
        Long,DataSource,DataSource,DataSource> {

    private DataSourceRepository repository;

    public DataSourceAppService(DataSourceRepository repository){
        super(repository);

    }
    @Override
    public DataSource mapToEntity(DataSource dataSource) {
        return null;
    }

    @Override
    public void mapToEntity(DataSource dataSource, DataSource dataSource2) {

    }

    @Override
    public DataSource mapToGetOutputDto(DataSource dataSource) {
        return null;
    }

    @Override
    public DataSource mapToGetListOutputDto(DataSource dataSource) {
        return null;
    }

    @Override
    public Specification<DataSource> createFilteredQuery(DataSource dataSource) {
        return null;
    }
}
