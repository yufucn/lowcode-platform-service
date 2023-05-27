package yufucn.lowcode.data;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import yufucn.lowcode.ddd.domain.entities.auditing.SoftDelete;

import javax.jws.Oneway;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wang
 * @date 2023/5/27 21:23
 */
public class DataFilterServiceImpl implements DataFilterService {

    private ConcurrentHashMap<Class<?>, DataFilter> _filter = new ConcurrentHashMap<>();

    public DataFilterServiceImpl() {
//        _filter.put(SoftDelete.class,new DataFilter(true));
    }

    @Override
    public void enable(Class<?> domainClass) {
        getFilter(domainClass).setEnabled(true);
    }

    @Override
    public void disable(Class<?> domainClass) {
        getFilter(domainClass).setEnabled(false);
    }

    @Override
    public boolean enabled(Class<?> domainClass) {
        return getFilter(domainClass).getEnabled();
    }

    private DataFilter getFilter(Class<?> domainClass) {
        if (!_filter.containsKey(domainClass)) {
            _filter.put(domainClass, new DataFilter(true));
        }
        return _filter.get(domainClass);

    }
}
