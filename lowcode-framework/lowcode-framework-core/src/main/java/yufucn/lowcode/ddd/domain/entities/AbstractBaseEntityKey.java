package yufucn.lowcode.ddd.domain.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Version;

import javax.persistence.*;
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
    private TKey id;

    @Version
    private Long version;
}
