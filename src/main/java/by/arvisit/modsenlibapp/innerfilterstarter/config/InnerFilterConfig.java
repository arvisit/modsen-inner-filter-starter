package by.arvisit.modsenlibapp.innerfilterstarter.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.web.AuthenticationEntryPoint;

import by.arvisit.modsenlibapp.innerfilterstarter.client.InnerCommunicationFeignConfiguration;
import by.arvisit.modsenlibapp.innerfilterstarter.client.UserClient;
import by.arvisit.modsenlibapp.innerfilterstarter.client.UserClientFeignConfiguration;
import by.arvisit.modsenlibapp.innerfilterstarter.filter.JwtInnerFilter;

@Configuration
@ConditionalOnProperty(prefix = "security.inner-filter", name = "include", havingValue = "true")
@Import({ UserClientFeignConfiguration.class, InnerCommunicationFeignConfiguration.class })
public class InnerFilterConfig {

    @Autowired
    private UserClient userClient;
    @Autowired
    private AuthenticationEntryPoint authenticationEntryPoint;

    @Bean
    @ConditionalOnMissingBean
    JwtInnerFilter jwtInnerFilter() {
        return new JwtInnerFilter(userClient, authenticationEntryPoint);
    }

}
