package yufucn.lowcode.ddd.application.contracts.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author wang
 * @date 2022/12/31 20:58
 */
@Getter
@Setter
public class ListResultDto<T> {
    private List<T> items;
}
