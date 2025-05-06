package eu.senla.waits;

import eu.senla.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {

    /**
     * Timeout 3 seconds.
     */
    public static final Duration TIMEOUT = Duration.ofSeconds(3000);

    public static WebElement wait(ExpectedCondition<WebElement> expectedCondition) {
        return new WebDriverWait(Driver.getInstance(), TIMEOUT)
                .withMessage("The element isn't visible")
                .until(expectedCondition);
    }

    public static WebElement waitVisibilityOfElementLocated(By locator) {
        return wait(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
