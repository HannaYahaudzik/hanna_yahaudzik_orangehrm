package eu.senla.general;

import eu.senla.driver.Driver;
import eu.senla.pageObject.auth.BaseAuthPage;
import eu.senla.strategy.login.LoginByAPI;
import eu.senla.strategy.login.LoginByForm;
import eu.senla.strategy.login.LoginStrategy;
import eu.senla.utilities.ReadPropertyFile;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {

    LoginStrategy loginStrategy;

    public BaseTest() {
        if (this.getClass().getPackage().getName().contains("auth")
                && Boolean.parseBoolean(ReadPropertyFile.getProperties("LOGIN_BY_API"))) {
            loginStrategy = new LoginByAPI();
        }else {
            loginStrategy = new LoginByForm();
        }
    }

    public final BaseAuthPage login(){
        return loginStrategy.login();
    }

    @AfterEach
    public final void quitDriver() {
        Driver.quit();
    }
}
