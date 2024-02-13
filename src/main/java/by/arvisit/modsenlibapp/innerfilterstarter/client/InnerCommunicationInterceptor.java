package by.arvisit.modsenlibapp.innerfilterstarter.client;

import org.springframework.http.HttpHeaders;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class InnerCommunicationInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            String token = (String) authentication.getCredentials();
            template.header(HttpHeaders.AUTHORIZATION, "Bearer " + token);
        }
    }

}
