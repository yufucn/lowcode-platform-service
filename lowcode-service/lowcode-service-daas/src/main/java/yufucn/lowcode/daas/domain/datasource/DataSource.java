package yufucn.lowcode.daas.domain.datasource;

import lombok.*;
import yufucn.lowcode.ddd.domain.entities.auditing.FullAuditedEntity;
import yufucn.lowcode.multitenancy.TenantAware;
import yufucn.lowcode.multitenancy.TenantListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.validation.constraints.Size;

/**
 * @author wang
 * @date 2022/12/30 23:38
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(TenantListener.class)
public class DataSource extends FullAuditedEntity<Long> implements TenantAware {
    @Size(max = 64)
    private String name;

    @Size(max = 32)
    private String tenantId;
}
