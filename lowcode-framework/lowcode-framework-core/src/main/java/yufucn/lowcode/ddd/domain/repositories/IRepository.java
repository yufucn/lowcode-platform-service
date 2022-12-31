package yufucn.lowcode.ddd.domain.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author wang
 * @date 2022/12/31 23:41
 */
public interface IRepository<Entity, TKey>
        extends PagingAndSortingRepository<Entity, TKey>, JpaSpecificationExecutor<Entity> {
}
