package yufucn.lowcode.ddd.application.contracts.services;

/**
 * @author wang
 * @date 2022/12/31 20:46
 */
public interface ICreateUpdateAppService<TKey, TGetOutputDto, TCreateUpdateInput, TUpdateInput>
        extends ICreateAppService<TGetOutputDto, TCreateUpdateInput>,
        IUpdateAppService<TKey, TGetOutputDto, TUpdateInput> {
}
