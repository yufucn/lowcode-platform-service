package yufucn.lowcode.ddd.application.contracts.services;

/**
 * @author wang
 * @date 2022/12/31 20:46
 */
public interface ICreateUpdateAppService<TGetOutputDto, TKey, TCreateUpdateInput, TUpdateInput>
        extends ICreateAppService<TGetOutputDto, TCreateUpdateInput>,
        IUpdateAppService<TGetOutputDto, TKey, TUpdateInput>
{
}
