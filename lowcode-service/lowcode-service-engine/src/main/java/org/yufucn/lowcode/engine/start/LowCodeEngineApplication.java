package org.yufucn.lowcode.engine.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author wang
 * @date 2022/10/29 10:38
 */
@SpringBootApplication
//@EnableJpaAuditing
public class LowCodeEngineApplication {
    public static void main(String[] args) {
        SpringApplication.run(LowCodeEngineApplication.class, args);
    }
}
