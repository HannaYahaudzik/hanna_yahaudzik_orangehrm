package eu.senla.entity;


public class User{
    private final String username;
    private final String password;

    public User(final UserBuilder builder) {
        this.username = builder.username;
        this.password = builder.password;
    }

    public final String getUsername() {
        return username;
    }

    public final String getPassword() {
        return password;
    }

    public static class UserBuilder {
        private String username;
        private String password;

        public final UserBuilder username(final String username) {
            this.username = username;
            return this;
        }

        public final UserBuilder password(final String password) {
            this.password = password;
            return this;
        }

        public final User build() {
            return new User(this);
        }
    }
}
