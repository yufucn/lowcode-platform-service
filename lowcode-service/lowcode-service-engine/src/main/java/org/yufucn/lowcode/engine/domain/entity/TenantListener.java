package org.yufucn.lowcode.engine.domain.entity;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

/**
 * @author wang
 * @date 2022/11/4 23:39
 */
public class TenantListener {

    @PreUpdate
    @PreRemove
    @PrePersist
    public void setTenant(TenantAware entity) {
        final Long tenantId = TenantContext.getTenantId();
        entity.setTenantId(tenantId);
    }
}
