package yufucn.lowcode.ddd.domain.entities;

/**
 * @author wang
 * @date 2022/12/30 23:48
 */
public interface IEntityKey<TKey> extends IEntity {
    TKey id();
}