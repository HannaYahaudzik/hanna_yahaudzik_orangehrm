package eu.senla;

import eu.senla.general.GeneralTest;
import eu.senla.utils.login.Login;
import org.junit.jupiter.api.Test;

public class LoginTest extends GeneralTest {

    @Test
    public void loginSuccess() {
        driver.get(URL);
        Login.loginSuccess();
    }
}
