package eu.senla.general;

import eu.senla.driver.Driver;
import eu.senla.utilities.ReadPropertyFile;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public final void initDriver() {
        Driver.getInstance().get(ReadPropertyFile.getProperties("BASE_URL"));
    }

    @AfterEach
    public final void quitDriver() {
        Driver.quit();
    }
}
