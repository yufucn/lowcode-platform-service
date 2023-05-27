package yufucn.lowcode.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yufucn.lowcode.ddd.domain.repositories.CustomJpaRepositoryFactoryBean;
import yufucn.lowcode.ddd.domain.repositories.IRepository;

/**
 * @author wang
 * @date 2023/5/27 21:37
 */
@Configuration
public class DataConfig {

    @Bean
    public DataFilterService dataFilterService() {
        return new DataFilterServiceImpl();
    }

    @Bean
    public CustomJpaRepositoryFactoryBean<?, ?, ?> customJpaRepositoryFactoryBean() {
        return new CustomJpaRepositoryFactoryBean<>(IRepository.class, dataFilterService());
    }
}
