package yufucn.lowcode.daas.application;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import yufucn.lowcode.daas.application.convert.DataSourceConvert;
import yufucn.lowcode.daas.application.dtos.DataSourceDto;
import yufucn.lowcode.daas.domain.datasource.DataSource;
import yufucn.lowcode.daas.domain.datasource.DataSourceRepository;
import yufucn.lowcode.ddd.application.contracts.dtos.PagedAndSortedResultRequestDto;
import yufucn.lowcode.ddd.application.convert.IMapper;
import yufucn.lowcode.ddd.application.services.CrudSimpleAppService;

/**
 * @author wang
 * @date 2023/1/1 0:08
 */
@Service
public class DataSourceAppService extends CrudSimpleAppService<
        Long,
        DataSource,
        DataSourceDto> {

    private DataSourceRepository repository;
    private final IMapper<DataSource,DataSourceDto,DataSourceDto,DataSourceDto,DataSourceDto>
            dataSourceConvert = DataSourceConvert.INSTANCE;


    public DataSourceAppService(DataSourceRepository repository) {
        super(repository);

    }

    @Override
    public DataSource mapToEntity(DataSourceDto dataSourceDto) {
        return
                dataSourceConvert.mapToEntity(dataSourceDto);
    }

    @Override
    public void mapToEntity(DataSourceDto dataSourceDto, DataSource dataSource) {
        dataSourceConvert.mapToEntity(dataSourceDto, dataSource);
    }

    @Override
    public DataSourceDto mapToGetOutputDto(DataSource dataSource) {

        return dataSourceConvert.mapToGetOutputDto(dataSource);
    }

    @Override
    public Specification<DataSource> createFilteredQuery(PagedAndSortedResultRequestDto pagedAndSortedResultRequestDto) {
        return null;
    }
}
