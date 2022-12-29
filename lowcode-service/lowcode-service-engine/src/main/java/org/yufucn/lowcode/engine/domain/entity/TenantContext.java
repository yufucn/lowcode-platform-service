package org.yufucn.lowcode.engine.domain.entity;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wang
 * @date 2022/11/4 23:42
 */
@Slf4j
public class TenantContext {
    private TenantContext() {}

    private static final InheritableThreadLocal<Long> CURRENT_TENANT = new InheritableThreadLocal<>();

    public static void setTenantId(Long tenantId) {
        log.debug("Setting tenantId to " + tenantId);
        CURRENT_TENANT.set(tenantId);
    }

    public static Long getTenantId() {
        return CURRENT_TENANT.get();
    }

    public static void clear(){
        CURRENT_TENANT.remove();
    }
}
