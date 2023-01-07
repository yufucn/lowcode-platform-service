package yufucn.lowcode.daas.web;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import yufucn.lowcode.daas.application.DataSourceAppService;
import yufucn.lowcode.daas.application.dtos.DataSourceCreateDto;
import yufucn.lowcode.daas.application.dtos.DataSourceDto;
import yufucn.lowcode.ddd.application.contracts.dtos.PagedAndSortedResultRequestDto;

import java.util.List;

/**
 * @author wang
 * @date 2022/12/30 22:31
 */
@RestController
public class DataSourceController {

    private final DataSourceAppService dataSourceAppService;

    public DataSourceController(DataSourceAppService dataSourceAppService) {
        this.dataSourceAppService = dataSourceAppService;
    }

    @PostMapping("/datasource")
    public DataSourceDto create(DataSourceCreateDto input) {
        return dataSourceAppService.create(input);
    }

    @GetMapping("/datasource")
    public Page<DataSourceDto> list(PagedAndSortedResultRequestDto pagedAndSortedResultRequestDto) {
        return dataSourceAppService.getList(pagedAndSortedResultRequestDto);
    }

    @DeleteMapping("/datasource/{id}")
    public Boolean delete(@PathVariable Long id) {
        dataSourceAppService.delete(id);
        return true;
    }
}
