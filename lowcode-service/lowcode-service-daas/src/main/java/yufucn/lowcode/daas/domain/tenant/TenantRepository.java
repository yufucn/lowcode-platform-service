package yufucn.lowcode.daas.domain.tenant;

import org.springframework.data.repository.CrudRepository;
import yufucn.lowcode.daas.domain.datasource.DataSource;

/**
 * @author wang
 * @date 2022/12/31 20:30
 */
public interface TenantRepository extends CrudRepository<Tenant, Long> {
}
