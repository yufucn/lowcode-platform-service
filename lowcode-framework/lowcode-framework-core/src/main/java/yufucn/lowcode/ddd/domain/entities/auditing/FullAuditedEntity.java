package yufucn.lowcode.ddd.domain.entities.auditing;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

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
@SQLDelete(sql = "update #{#entityName} set is_deleted=true where id=?")
@Where(clause = "is_deleted = false")
public abstract class FullAuditedEntity <TKey extends Serializable> extends AuditedEntity<TKey> {
    private Boolean isDeleted;
    @Size(max = 32)
    private String deleterId;
    private Date deletionTime;
}
