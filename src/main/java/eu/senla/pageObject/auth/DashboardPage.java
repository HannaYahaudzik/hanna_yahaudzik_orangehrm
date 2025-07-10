package eu.senla.pageObject.auth;

import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

public class DashboardPage extends BaseAuthPage {

    public static final String TITLE = "Dashboard";
    public static final String URL = "/dashboard/index";

    private final By pageHeaderBy = By.className("oxd-topbar-header-breadcrumb-module");
    public final String getPageHeader() {
        return Wait.waitVisibilityOfElementLocated(pageHeaderBy).getText();
    }
}
