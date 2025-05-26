package eu.senla.pageObject.login;

import com.github.javafaker.Faker;
import eu.senla.driver.Driver;
import eu.senla.entity.LoginUser;
import eu.senla.pageObject.login.homePage.HomePage;
import eu.senla.wait.Wait;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

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
     * Locator for a login title.
     */
    private final By loginTitle = By.className("orangehrm-login-title");

    /**
     * Locator for an error message.
     */
    private final By errorText = By.className("oxd-alert-content-text");

    /**
     * Locator for an error message of required field.
     */
    private final By requiredText = By.className("oxd-input-field-error-message");

    private final By errorInput = By.className("oxd-input--error");

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

    public final String getErrorMessage() {
        return Wait.waitVisibilityOfElementLocated(errorText).getText();
    }

    public final LoginPage enterUsername(final String username) {
        Wait.waitVisibilityOfElementLocated(usernameBy).sendKeys(username);
        return this;
    }

    public final LoginPage enterPassword(final String password) {
        Wait.waitVisibilityOfElementLocated(passwordBy).sendKeys(password);
        return this;
    }

    public final LoginPage clickLoginButton() {
        Wait.waitVisibilityOfElementLocated(loginButtonBy).click();
        return this;
    }

    public final LoginPage loginUser(final LoginUser user) {
        enterUsername(user.getUsername());
        enterPassword(user.getPassword());
        clickLoginButton();
        return this;
    }

    public final LoginPage loginFakerUser() {
        Faker faker = new Faker();

        LoginUser user = LoginUser.builder()
                .username(String.valueOf(faker.name()))
                .password(String.valueOf(faker.name()))
                .build();
        loginUser(user);
        return this;
    }

    public final HomePage loginValidUser() {
        LoginUser user = LoginUser.builder()
                .username(USERNAME)
                .password(PASSWORD)
                .build();
        loginUser(user);
        return new HomePage();
    }

    public final String getTitle() {
        return Wait.waitVisibilityOfElementLocated(loginTitle).getText();
    }

    public final String getErrorText() {
        return Wait.waitVisibilityOfElementLocated(errorText).getText();
    }

    public final String getRequiredText() {
        return Wait.waitVisibilityOfElementLocated(requiredText).getText();
    }

    public final List<String> getRequiredFieldNameWithError() {
        getRequiredText();
        return Driver.getInstance().findElements(errorInput).stream()
                .map((f) -> f.getDomAttribute("name"))
                .collect(Collectors.toList());
    }
}
