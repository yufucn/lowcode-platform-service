package yufucn.lowcode.daas.domain.datasource;

import org.springframework.data.repository.CrudRepository;
import yufucn.lowcode.ddd.domain.repositories.IRepository;

/**
 * @author wang
 * @date 2022/12/31 20:27
 */
public interface DataSourceRepository extends IRepository<DataSource, Long> {
}
