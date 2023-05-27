package yufucn.lowcode.multitenancy;

/**
 * @author wang
 * @date 2022/12/30 23:15
 */
public interface TenantAware {
    /**
     * 获取租户Id
     * @return 字符串
     */
    String getTenantId();

    /**
     * 设置租户Id
     * @param tenantId 租户id
     */
    void setTenantId(String tenantId);
}
