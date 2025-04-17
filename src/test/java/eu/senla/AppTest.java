package eu.senla;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.w3c.dom.xpath.*;

public class AppTest {

    @Test
    public void firstTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.close();
    }
    {

    }
}
