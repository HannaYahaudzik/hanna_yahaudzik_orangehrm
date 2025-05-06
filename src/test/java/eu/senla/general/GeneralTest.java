package eu.senla.general;

import eu.senla.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class GeneralTest {

    protected final String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    protected WebDriver driver;

    @BeforeEach
    public void initDriver() {
        driver = Driver.getInstance();
        driver.get(URL);
    }

    @AfterEach
    public void quitDriver() {
        Driver.quit();
    }

}
