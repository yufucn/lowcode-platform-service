package yufucn.lowcode.daas.application.impl;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.output.MigrateResult;
import org.springframework.stereotype.Service;
import yufucn.lowcode.daas.application.IFlywayAppService;

import javax.sql.DataSource;

/**
 * @author wang
 * @date 2023/1/18 22:25
 */
@Service
public class FlywayAppServiceImpl implements IFlywayAppService {

    @Override
    public boolean create(String url, String user, String password) {
        Flyway flyway = Flyway.configure()
                .dataSource(url, user, password)
                .locations("s3:flyway/db/migration/")
                .load();
        flyway.migrate();
        return true;
    }
}
