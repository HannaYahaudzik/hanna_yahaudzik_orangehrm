package eu.senla.strategy.login;

import eu.senla.pageObject.auth.BaseAuthPage;

public class LoginByAPI implements LoginStrategy{
    @Override
    public BaseAuthPage login() {
        System.out.println("login by api");
        return null;
    }
}
