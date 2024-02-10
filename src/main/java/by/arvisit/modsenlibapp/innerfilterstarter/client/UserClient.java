package by.arvisit.modsenlibapp.innerfilterstarter.client;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestHeader;

import by.arvisit.modsenlibapp.innerfilterstarter.dto.UserDto;

public interface UserClient {

    UserDto validate(@RequestHeader(name = HttpHeaders.AUTHORIZATION) String authHeader);
}
