package eu.senla.pageObject.login;

import eu.senla.pageObject.login.homePage.HomePage;
import eu.senla.waits.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private final String USERNAME = "Admin";
    private final String PASSWORD = "admin123";

    private final By usernameBy = By.name("username");
    private final By passwordBy = By.name("password");
    private final By loginButtonBy = By.tagName("button");

    public WebElement getUsernameInput() {
        return Waits.waitVisibilityOfElementLocated(usernameBy);
    }

    public WebElement getPasswordInput() {
        return Waits.waitVisibilityOfElementLocated(passwordBy);
    }

    public WebElement getLoginButton() {
        return Waits.waitVisibilityOfElementLocated(loginButtonBy);
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
