package eu.senla;

import eu.senla.general.GeneralTest;
import eu.senla.waits.Waits;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginTest extends GeneralTest {

    @Test
    public void loginSuccess() {

        driver.get(URL);

        Waits.wait(ExpectedConditions.visibilityOfElementLocated(By.name("username")))
                .sendKeys("Admin");

        Waits.wait(ExpectedConditions.visibilityOfElementLocated(By.name("password")))
                .sendKeys("admin123");

        Waits.wait(ExpectedConditions.visibilityOfElementLocated(By.tagName("button")))
                .click();
    }

    @Test
    public void addEmployee() {

        loginSuccess();

        Waits.wait(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//span[text()='Admin']")))
                .click();

        Waits.wait(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//button[text()=' Add ']")))
                .click();

//            // Login page
//            driver.findElement(By.xpath(".//h5[text()='Login']"));
//            driver.findElement(By.name("username")).sendKeys("Admin");
//            driver.findElement(By.name("password")).sendKeys("admin123");
//            driver.findElement(By.tagName("button")).click();
//            Thread.sleep(TIMEOUT);
//
//            // Dashboard page
//            driver.findElement(By.xpath(".//span[text()='Admin']")).click();
//            Thread.sleep(TIMEOUT);

        // Admin page
//            driver.findElement(By.xpath(".//label[text()='Username']/../..//input"));
//
//            // Dropdown 'User Role'
//            driver.findElement(By.xpath(".//label[text()='User Role']/../..//div[text()='-- Select --']")).click();
//            driver.findElement(By.xpath(".//div/span[text()='Admin']")).click();
//            Thread.sleep(TIMEOUT);
//
//            driver.findElement(By.xpath(".//button[text()=' Search ']"));
//            driver.findElement(By.xpath(".//button[text()=' Add ']"));

    }
}
