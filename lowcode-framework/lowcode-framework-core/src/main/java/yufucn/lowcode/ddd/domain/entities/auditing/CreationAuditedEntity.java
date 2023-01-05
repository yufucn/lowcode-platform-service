package yufucn.lowcode.ddd.domain.entities.auditing;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import yufucn.lowcode.ddd.domain.entities.AbstractBaseEntityKey;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * @author wang
 * @date 2022/12/31 19:54
 */
@MappedSuperclass
@Getter
@Setter
public abstract class CreationAuditedEntity<TKey extends Serializable> extends AbstractBaseEntityKey<TKey> {
    private Date creationTime;
    @Size(max = 32)
    private String creatorId;
}
