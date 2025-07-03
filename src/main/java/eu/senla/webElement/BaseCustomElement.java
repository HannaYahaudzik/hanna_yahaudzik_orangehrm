package eu.senla.webElement;

import eu.senla.utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class BaseCustomElement {

    private final String name;

    public BaseCustomElement(final String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    protected abstract By getBy();

    public final WebElement getWebElement() {
        return Wait.waitVisibilityOfElementLocated(getBy());
    }
}
