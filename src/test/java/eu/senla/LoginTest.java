package eu.senla;

import eu.senla.driver.Driver;
import eu.senla.general.BaseTest;
import eu.senla.pageObject.login.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LoginTest extends BaseTest {

    @Test
    public void loginSuccess() {
        new LoginPage().loginValidUser().getPageHeader();
        Assertions.assertTrue(Driver.getInstance().getCurrentUrl().contains("/dashboard/index"));
    }
}
