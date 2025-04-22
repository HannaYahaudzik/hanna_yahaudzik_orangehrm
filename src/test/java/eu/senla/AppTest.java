package eu.senla;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

    /**
     * Timeout 5 seconds.
     */
    public static final int TIMEOUT = 5000;

    @Test
    public void firstTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(TIMEOUT);

            // Login page
            driver.findElement(By.xpath(".//h5[text()='Login']"));
            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.findElement(By.tagName("button")).click();
            Thread.sleep(TIMEOUT);

            // Dashboard page
            driver.findElement(By.xpath(".//span[text()='Admin']")).click();
            Thread.sleep(TIMEOUT);

            // Admin page
            driver.findElement(By.xpath(".//label[text()='Username']/../..//input"));

            // Dropdown 'User Role'
            driver.findElement(By.xpath(".//label[text()='User Role']/../../div[2]")).click();
            driver.findElement(By.xpath(".//div/span[text()='Admin']")).click();
            Thread.sleep(TIMEOUT);

            driver.findElement(By.xpath(".//button[text()=' Search ']"));
            driver.findElement(By.xpath(".//button[text()=' Add ']"));

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            driver.close();
        }
    }
}
