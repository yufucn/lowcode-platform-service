package yufucn.lowcode.ddd.domain.entities.auditing;

/**
 * @author wang
 * @date 2023/5/27 22:01
 */
public interface SoftDelete {

    Integer getDeleted();

    void setDeleted(Integer value);
}
