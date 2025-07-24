package eu.senla.strategy.login;

import eu.senla.pageObject.auth.BaseAuthPage;

public interface LoginStrategy {
    BaseAuthPage login();
}
