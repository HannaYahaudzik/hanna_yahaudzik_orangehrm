package eu.senla.webElement;

import eu.senla.utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class BaseCustomElement {

    private String name;

    public BaseCustomElement(final String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    abstract String getXpathExpression();

    public final WebElement getWebElement() {
        return Wait.waitVisibilityOfElementLocated(By.xpath(getXpathExpression()));
    }
}
