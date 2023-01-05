package yufucn.lowcode.ddd.domain.entities.auditing;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * @author wang
 * @date 2022/12/31 19:57
 */
@MappedSuperclass
@Getter
@Setter
public abstract class AuditedEntity <TKey extends Serializable> extends CreationAuditedEntity<TKey> {
    private Date lastModificationTime;
    @Size(max = 32)
    private String lastModifierId;
}
