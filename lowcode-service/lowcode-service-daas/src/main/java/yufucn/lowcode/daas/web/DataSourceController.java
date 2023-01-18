package yufucn.lowcode.daas.web;

import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DataSourceProperty;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import yufucn.lowcode.daas.application.DataSourceAppService;
import yufucn.lowcode.daas.application.IFlywayAppService;
import yufucn.lowcode.daas.application.dtos.DataSourceCreateDto;
import yufucn.lowcode.daas.application.dtos.DataSourceDto;
import yufucn.lowcode.ddd.application.contracts.dtos.PagedAndSortedResultRequestDto;

import javax.sql.DataSource;

/**
 * @author wang
 * @date 2022/12/30 22:31
 */
@RestController
public class DataSourceController {

    private final DataSourceAppService dataSourceAppService;

    private final IFlywayAppService flywayAppService;

    public DataSourceController(DataSourceAppService dataSourceAppService,
                                IFlywayAppService flywayAppService) {
        this.dataSourceAppService = dataSourceAppService;
        this.flywayAppService = flywayAppService;
    }

    @PostMapping("/datasource")
    public DataSourceDto create(@Validated @RequestBody DataSourceCreateDto input) {
        DataSourceDto result =  dataSourceAppService.create(input);
        flywayAppService.create(input.getUrl(),input.getUsername(),input.getPassword());
        return result;
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
