package yufucn.lowcode.daas.application.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import yufucn.lowcode.ddd.application.contracts.dtos.FullAuditedEntityDto;

/**
 * @author wang
 * @date 2023/1/1 15:29
 */
@Setter
@Getter
@AllArgsConstructor
public class DataSourceDto extends FullAuditedEntityDto<Long> {
    private String name;
}
