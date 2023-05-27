package yufucn.lowcode.daas.web;

import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import yufucn.lowcode.daas.application.DataSourceAppService;
import yufucn.lowcode.daas.application.IFlywayAppService;
import yufucn.lowcode.daas.application.dtos.DataSourceCreateDto;
import yufucn.lowcode.daas.application.dtos.DataSourceDto;
import yufucn.lowcode.data.DataFilterServiceImpl;
import yufucn.lowcode.ddd.application.contracts.dtos.PagedAndSortedResultRequestDto;
import yufucn.lowcode.ddd.domain.entities.auditing.SoftDelete;

/**
 * @author wang
 * @date 2022/12/30 22:31
 */
@RestController
public class DataSourceController {

    private final DataSourceAppService dataSourceAppService;

    private final IFlywayAppService flywayAppService;

    private DataFilterServiceImpl dataFilterService;

    public DataSourceController(DataSourceAppService dataSourceAppService,
                                IFlywayAppService flywayAppService,
                                DataFilterServiceImpl dataFilterService) {
        this.dataSourceAppService = dataSourceAppService;
        this.flywayAppService = flywayAppService;
        this.dataFilterService = dataFilterService;
    }

    @PostMapping("/datasource")
    public DataSourceDto create(@Validated @RequestBody DataSourceCreateDto input) {
        DataSourceDto result =  dataSourceAppService.create(input);
        flywayAppService.create(input.getUrl(),input.getUserName(),input.getPassword());
        return result;
    }

    @GetMapping("/datasource")
    public Page<DataSourceDto> list(PagedAndSortedResultRequestDto pagedAndSortedResultRequestDto) {
        return dataSourceAppService.getList(pagedAndSortedResultRequestDto);
    }

    @GetMapping("/datasource/{id}")
    public DataSourceDto get(@PathVariable Long id) {

//        DataSourceDto result =  dataSourceAppService.get(id);
//        System.out.println("disable");
//        System.out.println(result.toString());
        dataFilterService.disable(SoftDelete.class);
        DataSourceDto result =  dataSourceAppService.get(id);
        System.out.println("enable");
        System.out.println(result.toString());
        dataFilterService.enable(SoftDelete.class);

        result =  dataSourceAppService.get(id);
        return result;
    }

    @DeleteMapping("/datasource/{id}")
    public Boolean delete(@PathVariable Long id) {

        dataSourceAppService.delete(id);
        return true;
    }
}
