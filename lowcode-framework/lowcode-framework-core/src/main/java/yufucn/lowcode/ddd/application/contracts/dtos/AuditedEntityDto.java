package yufucn.lowcode.ddd.application.contracts.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author wang
 * @date 2022/12/31 20:38
 */
@Getter
@Setter
@NoArgsConstructor
public abstract class AuditedEntityDto <TKey> extends CreationAuditedEntityDto<TKey> {
    private Date lastModificationTime;
    private String lastModifierId;
}

