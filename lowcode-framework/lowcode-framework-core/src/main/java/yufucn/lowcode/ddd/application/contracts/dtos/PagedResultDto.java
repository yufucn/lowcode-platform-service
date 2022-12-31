package yufucn.lowcode.ddd.application.contracts.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author wang
 * @date 2022/12/31 20:49
 */
@Setter
@Getter
@Builder
public class PagedResultDto<T> extends ListResultDto<T> {
    private Long total;
}
