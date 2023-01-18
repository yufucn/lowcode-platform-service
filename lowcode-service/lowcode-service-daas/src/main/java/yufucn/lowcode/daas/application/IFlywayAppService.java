package yufucn.lowcode.daas.application;

import javax.sql.DataSource;

/**
 * @author wang
 * @date 2023/1/18 22:25
 */
public interface IFlywayAppService {
    boolean create(String url, String user, String password);
}
