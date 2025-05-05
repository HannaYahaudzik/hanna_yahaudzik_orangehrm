package eu.senla.adminPage.addEmployee;

import eu.senla.general.GeneralTest;
import eu.senla.utils.login.Login;
import eu.senla.waits.Waits;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AddEmployeeTest extends GeneralTest {

    @Test
    public void addEmployee() {

        driver.get(URL);
        Login.loginSuccess();

        Waits.waitVisibilityOfElementLocated(By.xpath(".//span[text()='Admin']"))
                .click();

        Waits.waitVisibilityOfElementLocated(By.xpath(".//button[text()=' Add ']"))
                .click();
    }
}
