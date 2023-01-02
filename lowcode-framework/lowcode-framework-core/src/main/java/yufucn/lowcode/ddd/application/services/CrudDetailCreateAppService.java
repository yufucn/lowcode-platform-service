package yufucn.lowcode.ddd.application.services;

import lombok.Getter;
import lombok.Setter;
import yufucn.lowcode.ddd.domain.entities.AbstractBaseEntityKey;
import yufucn.lowcode.ddd.domain.repositories.IRepository;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author wang
 * @date 2023/1/1 15:09
 */
@MappedSuperclass
@Getter
@Setter
public abstract class CrudDetailCreateAppService<
        TKey extends Serializable,
        TEntity extends AbstractBaseEntityKey<TKey>,
        TEntityDto,
        TGetListInput,
        TCreateInput>
        extends CrudDetailAppService<TKey, TEntity,
        TEntityDto,
        TGetListInput,
        TCreateInput, TCreateInput // 更新、保存使用同一个input
        > {

    public CrudDetailCreateAppService(IRepository<TEntity, TKey> repository) {
        super(repository);
    }
}
