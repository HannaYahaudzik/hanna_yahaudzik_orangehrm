package eu.senla.pageObject.login;

import eu.senla.pageObject.login.homePage.HomePage;
import eu.senla.wait.Wait;
import org.openqa.selenium.By;

public class LoginPage {

  /*
    A valid user credential.
   */

    /**
     * A valid username.
     */
    private final String USERNAME = "Admin";
    /**
     * A valid password.
     */
    private final String PASSWORD = "admin123";

    /**
     * Locator for an input Username.
     */
    private final By usernameBy = By.name("username");
    /**
     * Locator for an input Password.
     */
    private final By passwordBy = By.name("password");
    /**
     * Locator for a button Login.
     */
    private final By loginButtonBy = By.tagName("button");

    public final void loginUser(final String username, final String password) {
        Wait.waitVisibilityOfElementLocated(usernameBy).sendKeys(username);
        Wait.waitVisibilityOfElementLocated(passwordBy).sendKeys(password);
        Wait.waitVisibilityOfElementLocated(loginButtonBy).click();
    }

    public final HomePage loginValidUser() {
        loginUser(USERNAME, PASSWORD);
        return new HomePage();
    }
}
