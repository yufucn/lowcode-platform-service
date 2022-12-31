package yufucn.lowcode.ddd.application.contracts.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author wang
 * @date 2022/12/31 19:58
 */
@Getter
@Setter
@NoArgsConstructor
public abstract class FullAuditedEntityDto<TKey> extends AuditedEntityDto<TKey> {
    private Boolean isDeleted;
    private String deleterId;
    private Date deletionTime;
}
