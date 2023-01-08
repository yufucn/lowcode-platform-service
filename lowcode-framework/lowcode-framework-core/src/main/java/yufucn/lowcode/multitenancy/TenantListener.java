package yufucn.lowcode.multitenancy;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

/**
 * @author wang
 * @date 2023/1/8 13:48
 */
public class TenantListener {
    @PreUpdate
    @PreRemove
    @PrePersist
    public void setTenant(Object entity) {
        final String tenantId = TenantContext.getTenantId();
        TenantAware tenantAware = (TenantAware) entity;
        tenantAware.setTenantId(tenantId);
    }
}
