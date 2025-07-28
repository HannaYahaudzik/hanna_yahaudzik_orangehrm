package eu.senla.pages;

import eu.senla.driver.Driver;

public class BasePage {

    public final void openPage(final String url) {
        Driver.getInstance().get(url);
    }
}
