package eu.senla.strategies.login;

import eu.senla.pages.LoginPage;
import eu.senla.pages.auth.BaseAuthPage;

public class LoginByForm implements LoginStrategy {

    @Override
    public final BaseAuthPage login() {
        return new LoginPage().loginValidUser();
    }
}
