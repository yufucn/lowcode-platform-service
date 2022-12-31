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
 * @date 2022/12/31 19:58
 */
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class FullAuditedEntity <TKey extends Serializable> extends AuditedEntity<TKey> {
    private Boolean isDeleted;
    @Size(max = 32)
    private String deleterId;
    private Date deletionTime;
}
