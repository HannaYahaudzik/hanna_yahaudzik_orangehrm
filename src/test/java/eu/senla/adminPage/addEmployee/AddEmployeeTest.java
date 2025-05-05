package eu.senla.adminPage.addEmployee;

import eu.senla.general.GeneralTest;
import eu.senla.utils.login.Login;
import eu.senla.waits.Waits;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddEmployeeTest extends GeneralTest {

    @Test
    public void addEmployee() {

        driver.get(URL);
        Login.loginSuccess();

        Waits.wait(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//span[text()='Admin']")))
                .click();

        Waits.wait(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//button[text()=' Add ']")))
                .click();
    }
}
