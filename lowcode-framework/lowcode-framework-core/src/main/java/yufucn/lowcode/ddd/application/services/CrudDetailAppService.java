package yufucn.lowcode.ddd.application.services;

import lombok.Getter;
import lombok.Setter;
import yufucn.lowcode.ddd.application.contracts.services.ICrudAppService;
import yufucn.lowcode.ddd.application.convert.IDetailMapper;
import yufucn.lowcode.ddd.domain.entities.AbstractBaseEntityKey;
import yufucn.lowcode.ddd.domain.repositories.IRepository;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author wang
 * @date 2023/1/1 15:03
 */
@MappedSuperclass
public abstract class CrudDetailAppService<
        TKey extends Serializable,
        TEntity extends AbstractBaseEntityKey<TKey>,
        TEntityDto,
        TGetListInput,
        TCreateInput,
        TUpdateInput>
        extends CrudAppService<TKey, TEntity,
        TEntityDto, TEntityDto, // 详情、列表公用一个Dto
        TGetListInput, TCreateInput, TUpdateInput> {

    private IDetailMapper<TEntity, TEntityDto, TCreateInput, TUpdateInput> mapper;

    public CrudDetailAppService(IRepository<TEntity, TKey> repository
            , IDetailMapper<TEntity, TEntityDto, TCreateInput, TUpdateInput> mapper) {
        super(repository, mapper);
    }

    @Override
    public TEntityDto mapToGetListOutputDto(TEntity entity) {
        return mapToGetOutputDto(entity);
    }
}
