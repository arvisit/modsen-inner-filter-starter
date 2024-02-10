package by.arvisit.modsenlibapp.innerfilterstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties(prefix = "security.inner-filter")
public class InnerFilterProperties {

    private boolean include;

}
