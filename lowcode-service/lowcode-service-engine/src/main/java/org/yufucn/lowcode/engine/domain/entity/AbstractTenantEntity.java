package org.yufucn.lowcode.engine.domain.entity;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

/**
 * @author wang
 * @date 2022/11/4 23:58
 */
@MappedSuperclass
@FilterDef(name = "tenantFilter", parameters = {@ParamDef(name = "tenantId", type = "long")})
@Filter(name = "tenantFilter", condition = "tenant_id = :tenantId")
@EntityListeners(TenantListener.class)
public abstract class AbstractTenantEntity extends AbstractBaseEntity implements TenantAware {
    @NotNull
    private Long tenantId;
}
