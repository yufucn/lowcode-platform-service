package yufucn.lowcode.daas.domain.tenant;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * @author wang
 * @date 2022/12/30 23:21
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tenant {
    @Id
    @Size(max = 32)
    private String id;

    @Size(max = 64)
    private String name;
}
