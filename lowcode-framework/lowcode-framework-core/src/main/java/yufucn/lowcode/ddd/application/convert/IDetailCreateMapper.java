package yufucn.lowcode.ddd.application.convert;

import org.mapstruct.MapperConfig;

/**
 * @author wang
 * @date 2023/1/5 21:39
 */
@MapperConfig
public interface IDetailCreateMapper<
        TEntity,
        TEntityDto,
        TCreateInput> extends IDetailMapper<
        TEntity,
        TEntityDto,
        TCreateInput,
        TCreateInput> {

}
