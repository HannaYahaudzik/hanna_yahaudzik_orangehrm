package eu.senla.webElement;

import org.openqa.selenium.By;

public class Input extends BaseCustomElement {

    public Input(final String name) {
        super(name);
    }

    protected final By getBy() {
        return By.xpath("//form//label[text()='" + super.getName() + "']/../../div/input");
    }
}
