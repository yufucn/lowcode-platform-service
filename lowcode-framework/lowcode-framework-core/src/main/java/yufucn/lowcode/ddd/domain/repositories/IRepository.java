package yufucn.lowcode.ddd.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import yufucn.lowcode.ddd.domain.entities.AbstractBaseEntityKey;

import java.io.Serializable;

/**
 * @author wang
 * @date 2022/12/31 23:41
 */
public interface IRepository<Entity extends AbstractBaseEntityKey<TKey>, TKey extends Serializable>
        extends JpaRepository<Entity, TKey>, JpaSpecificationExecutor<Entity> {
}
