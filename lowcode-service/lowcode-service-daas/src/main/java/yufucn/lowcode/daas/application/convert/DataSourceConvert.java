package yufucn.lowcode.daas.application.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import yufucn.lowcode.daas.application.dtos.DataSourceCreateDto;
import yufucn.lowcode.daas.application.dtos.DataSourceDto;
import yufucn.lowcode.daas.domain.datasource.DataSource;
import yufucn.lowcode.ddd.application.convert.IDetailCreateMapper;
import yufucn.lowcode.ddd.application.convert.ISimpleMapper;

/**
 * @author wang
 * @date 2023/1/3 21:54
 */
@Mapper
public interface DataSourceConvert extends IDetailCreateMapper<DataSource, DataSourceDto, DataSourceCreateDto> {
    DataSourceConvert INSTANCE = Mappers.getMapper(DataSourceConvert.class);
}
