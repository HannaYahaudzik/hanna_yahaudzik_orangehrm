package eu.senla.pageObject;

import eu.senla.driver.Driver;

public class BasePage {

    public final void openPage(String url) {
        Driver.getInstance().get(url);
    }
}
