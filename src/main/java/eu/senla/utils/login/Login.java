package eu.senla.utils.login;

import eu.senla.waits.Waits;
import org.openqa.selenium.By;

public class Login {

    private static final String USERNAME = "Admin";
    private static final String PASSWORD = "admin123";

    public static void loginSuccess(){
        Waits.waitVisibilityOfElementLocated(By.name("username"))
                .sendKeys(USERNAME);

        Waits.waitVisibilityOfElementLocated(By.name("password"))
                .sendKeys(PASSWORD);

        Waits.waitVisibilityOfElementLocated(By.tagName("button"))
                .click();
    }
}
