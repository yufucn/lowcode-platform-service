package yufucn.lowcode.ddd.application.contracts.dtos;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wang
 * @date 2022/12/31 21:03
 */
@Getter
@Setter
public class PagedResultRequestDto {
    private Integer pageSize;
    private Integer pageIndex;
}
