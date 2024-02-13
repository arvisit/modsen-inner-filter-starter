package by.arvisit.modsenlibapp.innerfilterstarter.client;

import org.springframework.cloud.openfeign.FeignClientProperties.FeignClientConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;

@Configuration
public class InnerCommunicationFeignConfiguration extends FeignClientConfiguration {

    @Bean
    RequestInterceptor innerCommunicationInterceptor() {
        return new InnerCommunicationInterceptor();
    }
}
