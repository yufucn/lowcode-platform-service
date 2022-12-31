//package yufucn.lowcode.daas.config;
//
//import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
//import lombok.Data;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.flywaydb.core.Flyway;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.annotation.PostConstruct;
//import javax.sql.DataSource;
//import java.util.Map;
//
///**
// * @author wang
// * @date 2022/12/29 21:58
// */
//@Slf4j
//@Configuration
//@RequiredArgsConstructor
//@EnableTransactionManagement
//public class FlywayConfig {
//
//    private final DataSource dataSource;
//
//    @Bean
//    @PostConstruct
//    public void migrateOrder() {
//        log.info("调用数据库生成工具");
//        DynamicRoutingDataSource ds = (DynamicRoutingDataSource) dataSource;
//        Map<String, DataSource> dataSources = ds.getDataSources();
//        dataSources.forEach((k, v) -> {
//            log.info("正在执行多数据源生成数据库文件 " + k);
//            Flyway flyway = Flyway.configure()
//                    .dataSource(v)
//                    .locations("s3:flyway/db/migration")
//                    .load();
//            flyway.migrate();
//        });
//    }
//}
