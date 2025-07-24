package eu.senla.strategy.login;

import eu.senla.pageObject.LoginPage;
import eu.senla.pageObject.auth.BaseAuthPage;

public class LoginByForm implements LoginStrategy {
    @Override
    public BaseAuthPage login() {
        return new LoginPage().loginValidUser();
    }
}
