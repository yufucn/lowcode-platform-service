package yufucn.lowcode.ddd.application.convert;

import org.mapstruct.MapperConfig;

/**
 * @author wang
 * @date 2023/1/5 21:39
 */
@MapperConfig
public interface ISimpleMapper<
        TEntity,
        TEntityDto> extends IDetailCreateMapper<
        TEntity,
        TEntityDto,
        TEntityDto> {
}
