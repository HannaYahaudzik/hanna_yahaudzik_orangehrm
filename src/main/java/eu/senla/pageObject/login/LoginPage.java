package eu.senla.pageObject.login;

import com.github.javafaker.Faker;
import eu.senla.driver.Driver;
import eu.senla.entity.User;
import eu.senla.pageObject.login.homePage.HomePage;
import eu.senla.utilities.ReadPropertyFile;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class LoginPage {

    private final By loginTitle = By.className("orangehrm-login-title");
    private final By usernameBy = By.name("username");
    private final By passwordBy = By.name("password");
    private final By loginButtonBy = By.tagName("button");

    private final By errorText = By.className("oxd-alert-content-text");
    private final By requiredText = By.className("oxd-input-field-error-message");
    private final By errorInput = By.className("oxd-input--error");

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

    public final LoginPage loginUser(final User user) {
        enterUsername(user.getUsername());
        enterPassword(user.getPassword());
        clickLoginButton();
        return this;
    }

    public final LoginPage loginFakerUser() {
        Faker faker = new Faker();

        User user = User.builder()
                .username(String.valueOf(faker.name().username()))
                .password(String.valueOf(faker.name()))
                .build();
        loginUser(user);
        return this;
    }

    public final HomePage loginValidUser() {
        User user = User.builder()
                .username(ReadPropertyFile.getProperties("USERNAME"))
                .password(ReadPropertyFile.getProperties("PASSWORD"))
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
