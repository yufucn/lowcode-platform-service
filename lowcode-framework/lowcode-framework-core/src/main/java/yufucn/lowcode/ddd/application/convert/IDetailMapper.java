package yufucn.lowcode.ddd.application.convert;

import org.mapstruct.MapperConfig;

/**
 * @author wang
 * @date 2023/1/5 21:39
 */
@MapperConfig
public interface IDetailMapper<
        TEntity,
        TEntityDto,
        TCreateInput,
        TUpdateInput> extends IMapper<
        TEntity,
        TEntityDto,
        TEntityDto,
        TCreateInput,
        TUpdateInput> {
}
