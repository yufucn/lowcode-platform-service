package yufucn.lowcode.ddd.domain.entities.auditing;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import yufucn.lowcode.ddd.domain.entities.AbstractBaseEntityKey;

import javax.persistence.EntityListeners;
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
@EntityListeners(value = {AuditingEntityListener.class})
public abstract class CreationAuditedEntity<TKey extends Serializable> extends AbstractBaseEntityKey<TKey> {
    @CreatedDate
    private Date creationTime;
    @Size(max = 32)
    @CreatedBy
    private String creatorId;
}
