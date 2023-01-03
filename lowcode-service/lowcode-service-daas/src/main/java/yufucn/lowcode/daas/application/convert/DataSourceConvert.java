package yufucn.lowcode.daas.application.convert;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import yufucn.lowcode.daas.application.dtos.DataSourceDto;
import yufucn.lowcode.daas.domain.datasource.DataSource;

/**
 * @author wang
 * @date 2023/1/3 21:54
 */
@Mapper
public interface DataSourceConvert {
    DataSourceConvert INSTANCE = Mappers.getMapper(DataSourceConvert.class);

    DataSourceDto toDto(DataSource entity);

    DataSource toEntity(DataSourceDto dto);

    void toEntity(DataSourceDto dto, @MappingTarget DataSource entity);
}
