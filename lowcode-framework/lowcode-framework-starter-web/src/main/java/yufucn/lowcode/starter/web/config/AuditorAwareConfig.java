package yufucn.lowcode.starter.web.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author wang
 * @date 2023/1/7 14:25
 */
@Component
public class AuditorAwareConfig implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("111111");
    }
}
