package yufucn.lowcode.ddd.application.contracts.services;

/**
 * @author wang
 * @date 2022/12/31 21:06
 */
public interface ICrudAppService<TKey, TGetOutputDto, TGetListOutputDto, TGetListInput, TCreateInput, TUpdateInput>
        extends
        IReadOnlyAppService<TKey, TGetOutputDto, TGetListOutputDto, TGetListInput>,
        ICreateUpdateAppService<TKey, TGetOutputDto, TCreateInput, TUpdateInput>,
        IDeleteAppService<TKey> {

}
