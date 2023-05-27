package yufucn.lowcode.ddd.domain.entities.auditing;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
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
public abstract class FullAuditedEntity<TKey extends Serializable>
        extends CreationAuditedEntity<TKey> implements SoftDelete {

    private Integer deleted = 0;

    @LastModifiedDate
    private Date lastModificationTime;
    @Size(max = 32)
    @LastModifiedBy
    private String lastModifierId;
}
