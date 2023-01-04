package yufucn.lowcode.daas.application.convert;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import yufucn.lowcode.daas.application.dtos.DataSourceDto;
import yufucn.lowcode.daas.domain.datasource.DataSource;
import yufucn.lowcode.ddd.application.convert.IMapper;

/**
 * @author wang
 * @date 2023/1/3 21:54
 */
@Mapper
public interface DataSourceConvert extends IMapper<DataSource,DataSourceDto,DataSourceDto,DataSourceDto,DataSourceDto> {
    IMapper<DataSource,DataSourceDto,DataSourceDto,DataSourceDto,DataSourceDto> INSTANCE =
            Mappers.getMapper(DataSourceConvert.class);
}
