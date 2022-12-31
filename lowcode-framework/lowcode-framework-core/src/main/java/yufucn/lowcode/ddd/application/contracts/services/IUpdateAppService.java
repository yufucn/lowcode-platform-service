package yufucn.lowcode.ddd.application.contracts.services;

/**
 * @author wang
 * @date 2022/12/31 20:40
 */
public interface IUpdateAppService<TGetOutputDto, TKey, TUpdateInput> {
    TGetOutputDto update(TKey id, TUpdateInput input);
}
