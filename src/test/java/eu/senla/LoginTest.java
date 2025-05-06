package eu.senla;

import eu.senla.general.GeneralTest;
import eu.senla.pageObject.login.LoginPage;
import org.junit.jupiter.api.Test;

public class LoginTest extends GeneralTest {

    @Test
    public void loginSuccess() {
        new LoginPage().loginValidUser();

    }
}
