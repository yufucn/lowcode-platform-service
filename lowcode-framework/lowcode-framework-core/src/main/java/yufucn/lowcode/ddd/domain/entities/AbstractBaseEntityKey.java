package yufucn.lowcode.ddd.domain.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author wang
 * @date 2022/12/30 23:49
 */
@MappedSuperclass
@Getter
@Setter
public abstract class AbstractBaseEntityKey<TKey extends Serializable>  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected TKey id;
}
