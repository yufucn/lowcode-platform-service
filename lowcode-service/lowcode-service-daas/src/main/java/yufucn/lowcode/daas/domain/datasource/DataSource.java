package yufucn.lowcode.daas.domain.datasource;

import lombok.*;
import yufucn.lowcode.ddd.domain.entities.auditing.FullAuditedEntity;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

/**
 * @author wang
 * @date 2022/12/30 23:38
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DataSource extends FullAuditedEntity<Long> {
    @Size(max = 64)
    private String name;
}
