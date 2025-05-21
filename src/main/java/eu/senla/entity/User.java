package eu.senla.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
    private String username;
    private String password;

//    public User(UserBuilder builder) {
//        this.username = builder.username;
//        this.password = builder.password;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public static class UserBuilder {
//        public String username;
//        public String password;
//
//        public UserBuilder username(final String username) {
//            this.username = username;
//            return this;
//        }
//
//        public UserBuilder password(final String password) {
//            this.password = password;
//            return this;
//        }
//
//        public User build() {
//            return new User(this);
//        }
//    }
}
