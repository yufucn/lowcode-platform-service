package yufucn.lowcode.daas.domain.datasource;

import lombok.*;
import yufucn.lowcode.ddd.domain.entities.AbstractBaseEntity;
import yufucn.lowcode.ddd.domain.entities.AbstractBaseEntityKey;
import yufucn.lowcode.multitenancy.IMultiTenant;

import javax.persistence.Entity;

/**
 * @author wang
 * @date 2022/12/30 23:38
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DataSource extends AbstractBaseEntityKey<Long> implements IMultiTenant {

    @Override
    public Object[] getKeys() {
        return new Object[0];
    }

    @Override
    public Long id() {
        return null;
    }

    @Override
    public String getTenantId() {
        return null;
    }
}
