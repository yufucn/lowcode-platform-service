package yufucn.lowcode.ddd.application.contracts.services;


import org.springframework.data.domain.Page;
import yufucn.lowcode.ddd.application.contracts.dtos.PagedResultDto;

/**
 * @author wang
 * @date 2022/12/31 20:48
 */
public interface IReadOnlyAppService <TGetOutputDto, TGetListOutputDto, TKey, TGetListInput> {
    TGetOutputDto get(TKey id);
    Page<TGetListOutputDto> getList(TGetListInput input);
}
