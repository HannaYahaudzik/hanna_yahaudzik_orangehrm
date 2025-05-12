package eu.senla.pageObject.login;

import eu.senla.pageObject.login.homePage.HomePage;
import eu.senla.wait.Wait;
import org.openqa.selenium.By;

public class LoginPage {

  private final String USERNAME = "Admin";
  private final String PASSWORD = "admin123";

  private final By usernameBy = By.name("username");
  private final By passwordBy = By.name("password");
  private final By loginButtonBy = By.tagName("button");

  public void loginUser(String username, String password) {
    Wait.waitVisibilityOfElementLocated(usernameBy).sendKeys(username);
    Wait.waitVisibilityOfElementLocated(passwordBy).sendKeys(password);
    Wait.waitVisibilityOfElementLocated(loginButtonBy).click();
  }

  public HomePage loginValidUser() {
    loginUser(USERNAME, PASSWORD);
    return new HomePage();
  }
}
