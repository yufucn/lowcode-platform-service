package yufucn.lowcode.ddd.domain.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import yufucn.lowcode.multitenancy.IMultiTenant;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author wang
 * @date 2022/12/30 23:11
 */
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractBaseEntity implements Serializable {
    @Id
    private Long id;
}
