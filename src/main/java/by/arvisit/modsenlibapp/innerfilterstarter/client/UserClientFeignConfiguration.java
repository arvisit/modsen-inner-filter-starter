package by.arvisit.modsenlibapp.innerfilterstarter.client;

import org.springframework.cloud.openfeign.FeignClientProperties.FeignClientConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.codec.ErrorDecoder;

@Configuration
public class UserClientFeignConfiguration extends FeignClientConfiguration {

    @Bean
    ErrorDecoder errorDecoder() {
        return new UserClientErrorDecoder();
    }
}
