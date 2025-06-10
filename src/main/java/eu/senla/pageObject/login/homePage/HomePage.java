package eu.senla.pageObject.login.homePage;

import eu.senla.commonElement.SidepanelPage;
import eu.senla.enums.Menu;
import eu.senla.pageObject.login.homePage.adminPage.AdminPage;
import eu.senla.pageObject.login.homePage.pimPage.PimPage;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

public class HomePage {

    private final By pageHeaderBy = By.className("oxd-text--h6");

    private final SidepanelPage sidepanelPage = new SidepanelPage();

    public final String getPageHeader() {
        return Wait.waitVisibilityOfElementLocated(pageHeaderBy).getText();
    }

    public final AdminPage clickAdminMenu() {
        sidepanelPage.clickMenu(Menu.ADMIN);
        return new AdminPage();
    }

    public final PimPage clickPimMenu() {
        sidepanelPage.clickMenu(Menu.PIM);
        return new PimPage();
    }
}
