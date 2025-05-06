package eu.senla.pageObject.login;

import eu.senla.pageObject.login.homePage.HomePage;
import eu.senla.waits.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static final String USERNAME = "Admin";
    private static final String PASSWORD = "admin123";

    private final By usernameBy = By.name("username");
    private final By passwordBy = By.name("password");
    private final By loginButtonBy = By.tagName("button");

    private WebElement usernameInput;
    private WebElement passwordInput;
    private WebElement loginButton;

    private void setUsernameInput() {
        usernameInput = Waits.waitVisibilityOfElementLocated(usernameBy);
    }

    private void setPasswordInput() {
        passwordInput = Waits.waitVisibilityOfElementLocated(passwordBy);
    }

    private void setLoginButton() {
        loginButton = Waits.waitVisibilityOfElementLocated(loginButtonBy);
    }

    public WebElement getUsernameInput() {
        if (usernameInput == null) {
            setUsernameInput();
        }
        return usernameInput;
    }

    public WebElement getPasswordInput() {
        if (passwordInput == null) {
            setPasswordInput();
        }
        return passwordInput;
    }

    public WebElement getLoginButton() {
        if (loginButton == null) {
            setLoginButton();
        }
        return loginButton;
    }

    public HomePage loginUser(String username, String password) {
        getUsernameInput().sendKeys(username);
        getPasswordInput().sendKeys(password);
        getLoginButton().click();
        return new HomePage();
    }

    public HomePage loginValidUser() {
        return loginUser(USERNAME, PASSWORD);
    }
}
