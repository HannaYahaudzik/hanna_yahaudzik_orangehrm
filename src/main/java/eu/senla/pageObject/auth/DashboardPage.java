package eu.senla.pageObject.auth;

import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

public class DashboardPage extends BaseAuthPage {

    private final By pageHeaderBy = By.className("oxd-text--h6");

    public final String getPageHeader() {
        return Wait.waitVisibilityOfElementLocated(pageHeaderBy).getText();
    }
}
