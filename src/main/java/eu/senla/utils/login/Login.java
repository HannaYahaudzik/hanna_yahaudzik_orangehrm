package eu.senla.utils.login;

import eu.senla.waits.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login {

    private static final String USERNAME = "Admin";
    private static final String PASSWORD = "admin123";

    public static void loginSuccess(){
        Waits.wait(ExpectedConditions.visibilityOfElementLocated(By.name("username")))
                .sendKeys(USERNAME);

        Waits.wait(ExpectedConditions.visibilityOfElementLocated(By.name("password")))
                .sendKeys(PASSWORD);

        Waits.wait(ExpectedConditions.visibilityOfElementLocated(By.tagName("button")))
                .click();
    }
}
