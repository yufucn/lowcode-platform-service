package yufucn.lowcode.ddd.application.contracts.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

/**
 * @author wang
 * @date 2022/12/31 20:35
 */
@Getter
@Setter
@NoArgsConstructor
public abstract class EntityDto<TKey> {
    private TKey id;
}
