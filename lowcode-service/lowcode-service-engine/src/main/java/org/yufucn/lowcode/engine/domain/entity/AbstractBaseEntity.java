package org.yufucn.lowcode.engine.domain.entity;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * @author wang
 * @date 2022/11/4 23:37
 */
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractBaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 64)
    @CreatedBy
    private String createdBy;

    @NotNull
    @CreatedDate
    private Date createdDate;

    @Size(max = 64)
    @LastModifiedBy
    private String modifiedBy;

    @LastModifiedDate
    private Date modifiedDate;
}
