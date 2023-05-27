package yufucn.lowcode.data;

/**
 * @author wang
 * @date 2023/5/27 21:22
 */
public interface DataFilterService {
   void enable(Class<?> domainClass);
   void disable(Class<?> domainClass);
   boolean enabled(Class<?> domainClass);
}
