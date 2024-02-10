package by.arvisit.modsenlibapp.innerfilterstarter.dto;

import java.util.Collection;

public record UserDto(String username, Collection<String> authorities) {

}
