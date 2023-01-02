package yufucn.lowcode.ddd.application.services;

/**
 * @author wang
 * @date 2023/1/1 15:19
 */

import lombok.Getter;
import lombok.Setter;
import yufucn.lowcode.ddd.domain.entities.AbstractBaseEntityKey;
import yufucn.lowcode.ddd.domain.repositories.IRepository;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Getter
@Setter
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
        TEntityDto>{
    public CrudDetailCreateSingleAppService(IRepository<TEntity, TKey> repository) {
        super(repository);
    }
}
