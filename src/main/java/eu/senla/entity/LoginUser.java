package eu.senla.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LoginUser {
    private String username;
    private String password;
}
