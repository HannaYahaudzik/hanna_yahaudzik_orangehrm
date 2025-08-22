package eu.senla.pages.auth;

import eu.senla.enums.SidepanelMenu;
import eu.senla.utilities.ReadPropertyFile;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

public class DashboardPage extends BaseAuthPage {

    public static final String TITLE = "Dashboard";
    public static final String URL = "/dashboard/index";

    private final By pageHeaderBy = By.className("oxd-topbar-header-breadcrumb-module");

    public DashboardPage() {
        openPage(ReadPropertyFile.getProperties("BASE_URL") + "/web/index.php/" + SidepanelMenu.DASHBOARD.getUrlPart());
    }

    public final String getPageHeader() {
        return Wait.waitVisibilityOfElementLocated(pageHeaderBy).getText();
    }
}
