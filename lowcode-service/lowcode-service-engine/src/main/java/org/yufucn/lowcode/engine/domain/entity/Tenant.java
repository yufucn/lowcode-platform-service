package org.yufucn.lowcode.engine.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author wang
 * @date 2022/10/29 10:24
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Tenant extends AbstractBaseEntity {

    @NotNull
    @Size(max = 255)
    private String name;
}
