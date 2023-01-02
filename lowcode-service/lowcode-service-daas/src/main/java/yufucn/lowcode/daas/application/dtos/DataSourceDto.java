package yufucn.lowcode.daas.application.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import yufucn.lowcode.ddd.application.contracts.dtos.EntityDto;

/**
 * @author wang
 * @date 2023/1/1 15:29
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
public class DataSourceDto extends EntityDto<Long> {
    private String name;
}
