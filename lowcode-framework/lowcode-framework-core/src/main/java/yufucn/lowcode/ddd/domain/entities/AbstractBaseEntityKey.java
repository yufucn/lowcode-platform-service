package yufucn.lowcode.ddd.domain.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

/**
 * @author wang
 * @date 2022/12/30 23:49
 */
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractBaseEntityKey<Key> extends AbstractBaseEntity implements IEntityKey<Key> {

}
