package eu.senla.customWebElements;

import org.openqa.selenium.By;

public class Dropdown extends BaseCustomElement {
    public Dropdown(final String name) {
        super(name);
    }

    @Override
    protected final By getBy() {
        return null;
    }
}
