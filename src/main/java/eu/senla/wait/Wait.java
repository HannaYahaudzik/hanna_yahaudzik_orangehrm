package eu.senla.wait;

import eu.senla.driver.Driver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class Wait {

    /**
     * Timeout 3 seconds.
     */
    static final Duration TIMEOUT = Duration.ofSeconds(3);

    public static WebElement wait(final ExpectedCondition<WebElement> expectedCondition) {
        return new WebDriverWait(Driver.getInstance(), TIMEOUT)
                .withMessage("The element isn't visible")
                .until(expectedCondition);
    }

    public static WebElement waitVisibilityOfElementLocated(final By locator) {
        return wait(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private Wait() {
        throw new UnsupportedOperationException("This is a utility class and can't be instantiated");
    }

}
