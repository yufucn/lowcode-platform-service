package yufucn.lowcode.daas;

//import org.flywaydb.core.api.configuration.S3ClientFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import yufucn.lowcode.ddd.domain.repositories.CustomJpaRepositoryFactoryBean;

import java.net.URI;

/**
 * @author wang
 * @date 2022/12/28 23:00
 */
@SpringBootApplication(scanBasePackages = "yufucn.lowcode")
@EnableJpaAuditing
@EnableJpaRepositories(repositoryFactoryBeanClass = CustomJpaRepositoryFactoryBean.class)
public class DaasApplication {

    public static void main(String[] args) {
//        S3Client s3Client = S3Client.builder()
//                .credentialsProvider(StaticCredentialsProvider.create(
//                        AwsBasicCredentials.create("xZwChZGYdNCSZSsx", "d70mOeIoRplZqEkqIvgRJndTh9Rm7kiV")))
//                .endpointOverride(URI.create("http://localhost:9000"))
//                .serviceConfiguration(item -> item.pathStyleAccessEnabled(true).checksumValidationEnabled(false))
//                .region(Region.CN_NORTH_1)
//                .build();
//        S3ClientFactory.setClient(s3Client);
        SpringApplication.run(DaasApplication.class, args);
    }
}
