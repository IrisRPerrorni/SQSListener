package iris.sqsListener;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sqs.SqsAsyncClient;

import java.net.URI;

@Configuration
public class AwsConfig {

    @Value("${chave-acesso-aws}")
    private String chave;

    @Value("${senha-acesso-aws}")
    private String senha;

    @Value("${regiao-aws}")
    private String regiao;

    @Bean
    SqsAsyncClient aqsAsynClient(){
        return SqsAsyncClient.builder()
                .region(Region.of(regiao))
                .credentialsProvider(StaticCredentialsProvider.create(AwsBasicCredentials.create(chave,senha)))
                .endpointOverride(URI.create("http://localhost:4566"))
                .build();
    }







}



