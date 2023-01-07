package yufucn.lowcode.starter.web.config;

import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.ToStringSerializer;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author wang
 * @date 2023/1/7 14:22
 */
@Configuration
public class JsonConfig {
    @Bean
    FastJsonHttpMessageConverter fastJsonHttpMessageConverter() {
        //1.需要定义一个convert转换消息的对象
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();

        //2.添加fastJson的配置信息
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        //3.设置Long为字符串
        SerializeConfig serializeConfig = SerializeConfig.globalInstance;
        serializeConfig.put(Long.class, ToStringSerializer.instance);
        serializeConfig.put(Long.TYPE, ToStringSerializer.instance);
        fastJsonConfig.setSerializeConfig(serializeConfig);

        //4.在convert中添加配置信息.
        converter.setFastJsonConfig(fastJsonConfig);
        return converter;
    }
}
