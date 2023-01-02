package yufucn.lowcode.daas.application;

import org.springframework.data.jpa.domain.Specification;
import yufucn.lowcode.daas.application.dtos.DataSourceDto;
import yufucn.lowcode.daas.domain.datasource.DataSource;
import yufucn.lowcode.daas.domain.datasource.DataSourceRepository;
import yufucn.lowcode.ddd.application.contracts.dtos.PagedAndSortedResultRequestDto;
import yufucn.lowcode.ddd.application.services.CrudSimpleAppService;

/**
 * @author wang
 * @date 2023/1/1 0:08
 */
public class DataSourceAppService  extends CrudSimpleAppService<
        Long,
        DataSource,
        DataSourceDto> {

    private DataSourceRepository repository;

    public DataSourceAppService(DataSourceRepository repository){
        super(repository);

    }

    @Override
    public DataSource mapToEntity(DataSourceDto dataSourceDto) {
        return null;
    }

    @Override
    public void mapToEntity(DataSourceDto dataSourceDto, DataSource dataSource) {

    }

    @Override
    public DataSourceDto mapToGetOutputDto(DataSource dataSource) {
        return null;
    }

    @Override
    public Specification<DataSource> createFilteredQuery(PagedAndSortedResultRequestDto pagedAndSortedResultRequestDto) {
        return null;
    }
}
