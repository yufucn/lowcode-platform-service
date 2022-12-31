package yufucn.lowcode.ddd.application.contracts.services;

/**
 * @author wang
 * @date 2022/12/31 21:06
 */
public interface ICrudAppService<TGetOutputDto, TGetListOutputDto, TKey, TGetListInput, TCreateInput, TUpdateInput>
        extends
        IReadOnlyAppService<TGetOutputDto, TGetListOutputDto, TKey, TGetListInput>,
        ICreateUpdateAppService<TGetOutputDto, TKey, TCreateInput, TUpdateInput>,
        IDeleteAppService<TKey>
{

}
