package yufucn.lowcode.daas.config;

import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.Map;

/**
 * @author wang
 * @date 2022/12/29 21:58
 */
@Configuration
public class FlywayConfig {

    private final DataSource dataSource;

    public FlywayConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    @PostConstruct
    public void migrateOrder() {
        DynamicRoutingDataSource ds = (DynamicRoutingDataSource) dataSource;
        Map<String, DataSource> dataSources = ds.getDataSources();
        dataSources.forEach((k, v) -> {
            Flyway flyway = Flyway.configure()
                    .dataSource(v)
                    .locations("s3:flyway/db/migration")
                    .load();
            flyway.migrate();
        });
    }
}
