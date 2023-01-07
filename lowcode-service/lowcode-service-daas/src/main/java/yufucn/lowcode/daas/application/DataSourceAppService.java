package yufucn.lowcode.daas.application;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import yufucn.lowcode.daas.application.convert.DataSourceConvert;
import yufucn.lowcode.daas.application.dtos.DataSourceCreateDto;
import yufucn.lowcode.daas.application.dtos.DataSourceDto;
import yufucn.lowcode.daas.domain.datasource.DataSource;
import yufucn.lowcode.daas.domain.datasource.DataSourceRepository;
import yufucn.lowcode.ddd.application.contracts.dtos.PagedAndSortedResultRequestDto;
import yufucn.lowcode.ddd.application.convert.IMapper;
import yufucn.lowcode.ddd.application.services.CrudDetailCreateAppService;
import yufucn.lowcode.ddd.application.services.CrudSimpleAppService;

/**
 * @author wang
 * @date 2023/1/1 0:08
 */
@Service
public class DataSourceAppService extends CrudDetailCreateAppService<
        Long,
        DataSource,
        DataSourceDto,
        PagedAndSortedResultRequestDto,
        DataSourceCreateDto> {

    private DataSourceRepository repository;

    public DataSourceAppService(DataSourceRepository repository) {
        super(repository, DataSourceConvert.INSTANCE);

    }

    @Override
    public Specification<DataSource> createFilteredQuery(PagedAndSortedResultRequestDto pagedAndSortedResultRequestDto) {
        return null;
    }
}
