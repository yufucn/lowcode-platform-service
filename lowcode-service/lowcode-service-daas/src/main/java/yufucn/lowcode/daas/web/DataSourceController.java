package yufucn.lowcode.daas.web;

import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DataSourceProperty;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import yufucn.lowcode.daas.application.DataSourceAppService;
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

    private final DataSource  dataSource;

    public DataSourceController(DataSourceAppService dataSourceAppService, DataSource dataSource) {
        this.dataSourceAppService = dataSourceAppService;
        this.dataSource = dataSource;
    }

    @PostMapping("/datasource")
    public DataSourceDto create(@Validated @RequestBody DataSourceCreateDto input) {
        DataSourceProperty property = new DataSourceProperty();
        BeanUtils.copyProperties(input, property);
        DynamicRoutingDataSource ds = (DynamicRoutingDataSource) dataSource;
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
