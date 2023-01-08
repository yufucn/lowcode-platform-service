package yufucn.lowcode.multitenancy;

/**
 * @author wang
 * @date 2022/12/30 23:15
 */
public interface TenantAware {
    void setTenantId(String tenantId);
}
