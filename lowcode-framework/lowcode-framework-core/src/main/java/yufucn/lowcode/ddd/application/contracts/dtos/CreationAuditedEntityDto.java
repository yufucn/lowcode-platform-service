package yufucn.lowcode.ddd.application.contracts.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author wang
 * @date 2022/12/31 20:36
 */
@Getter
@Setter
@NoArgsConstructor
public abstract class CreationAuditedEntityDto<TKey>  extends EntityDto<TKey> {
    private Date creationTime;
    private String creatorId;
}
