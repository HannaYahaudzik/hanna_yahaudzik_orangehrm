package eu.senla.strategies.login;

import eu.senla.pages.auth.BaseAuthPage;

public interface LoginStrategy {
    BaseAuthPage login();
}
