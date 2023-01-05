package yufucn.lowcode.ddd.application.services;

/**
 * @author wang
 * @date 2023/1/1 15:19
 */

import lombok.Getter;
import lombok.Setter;
import yufucn.lowcode.ddd.application.convert.ISimpleMapper;
import yufucn.lowcode.ddd.domain.entities.AbstractBaseEntityKey;
import yufucn.lowcode.ddd.domain.repositories.IRepository;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class CrudDetailCreateSingleAppService<
        TKey extends Serializable,
        TEntity extends AbstractBaseEntityKey<TKey>,
        TEntityDto,
        TGetListInput>
        extends CrudDetailCreateAppService<
        TKey,
        TEntity,
        TEntityDto,
        TGetListInput,
        TEntityDto> {
    private ISimpleMapper<TEntity, TEntityDto> mapper;

    public CrudDetailCreateSingleAppService(IRepository<TEntity, TKey> repository,
                                            ISimpleMapper<TEntity, TEntityDto> mapper
    ) {
        super(repository, mapper);
    }
}
