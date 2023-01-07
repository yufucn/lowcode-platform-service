package yufucn.lowcode.ddd.application.convert;

import org.mapstruct.MapperConfig;
import org.mapstruct.MappingTarget;

/**
 * @author wang
 * @date 2023/1/4 23:53
 */
@MapperConfig
public interface IMapper<
        TEntity,
        TGetOutputDto,
        TGetListOutputDto,
        TCreateInput,
        TUpdateInput> {
    TGetOutputDto mapToGetOutputDto(TEntity entity);

    TGetListOutputDto mapToGetListOutputDto(TEntity entity);

    TEntity mapToEntity(TCreateInput createInput);

    void mapToEntity(TUpdateInput updateInput, @MappingTarget TEntity entity);
}
