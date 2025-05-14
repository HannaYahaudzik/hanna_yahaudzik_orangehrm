package eu.senla.general;

import eu.senla.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    /**
     * A start url.
     */
    private final String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";


    @BeforeEach
    public final void initDriver() {
        Driver.getInstance().get(URL);
    }

    @AfterEach
    public final void quitDriver() {
        Driver.quit();
    }
}
