package yufucn.lowcode.ddd.application.contracts.services;

/**
 * @author wang
 * @date 2022/12/31 20:47
 */
public interface IDeleteAppService<TKey> {
    void delete(TKey id);
}
