package yufucn.lowcode.ddd.domain.entities.auditing;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
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
@EntityListeners(value = {AuditingEntityListener.class})
public abstract class FullAuditedEntity <TKey extends Serializable>
        extends AuditedEntity<TKey> {

    private Boolean isDeleted;
    @Size(max = 32)
    private String deleterId;
    private Date deletionTime;
}
