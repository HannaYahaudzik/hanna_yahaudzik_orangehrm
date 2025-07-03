package eu.senla.commonElement;

import eu.senla.enums.SidepanelMenu;
import eu.senla.pageObject.auth.BaseAuthPage;
import eu.senla.pageObject.auth.DashboardPage;
import eu.senla.pageObject.auth.admin.AdminPage;
import eu.senla.pageObject.auth.buzz.BuzzPage;
import eu.senla.pageObject.auth.claim.ClaimPage;
import eu.senla.pageObject.auth.directory.DirectoryPage;
import eu.senla.pageObject.auth.leave.LeavePage;
import eu.senla.pageObject.auth.maintenance.MaintenancePage;
import eu.senla.pageObject.auth.myInfo.MyInfoPage;
import eu.senla.pageObject.auth.performance.PerformancePage;
import eu.senla.pageObject.auth.pim.PimPage;
import eu.senla.pageObject.auth.recruitment.RecruitmentPage;
import eu.senla.pageObject.auth.time.TimePage;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Sidepanel {

    private final By searchInput = RelativeLocator.with(By.className("oxd-main-menu-search")).below(By.tagName("input"));
    private final By searchButton = RelativeLocator.with(By.className("oxd-main-menu-search")).below(By.tagName("button"));
    private final String menuCssSelector = "ul.oxd-main-menu > li";
    private final By hideMenuButton = By.className("oxd-main-menu-button");

    public final WebElement getSearchInput() {
        return Wait.waitVisibilityOfElementLocated(searchInput);
    }

    public final WebElement getSearchButton() {
        return Wait.waitVisibilityOfElementLocated(searchButton);
    }

    public final WebElement getHideMenuButton() {
        return Wait.waitVisibilityOfElementLocated(hideMenuButton);
    }

    private String getMenuCssSelector(final String urlPart) {
        return menuCssSelector + " > a[href*='" + urlPart + "']";
    }

    public final BaseAuthPage clickMenu(final SidepanelMenu sidepanelMenuPoint) {
        Wait.waitVisibilityOfElementLocated(By.cssSelector(getMenuCssSelector(sidepanelMenuPoint.getUrlPart()))).click();
        switch (sidepanelMenuPoint) {
            case ADMIN:
                return new AdminPage();
            case PIM:
                return new PimPage();
            case LEAVE:
                return new LeavePage();
            case TIME:
                return new TimePage();
            case RECRUITMENT:
                return new RecruitmentPage();
            case MY_INFO:
                return new MyInfoPage();
            case PERFORMANCE:
                return new PerformancePage();
            case DASHBOARD:
                return new DashboardPage();
            case DIRECTORY:
                return new DirectoryPage();
            case MAINTENANCE:
                return new MaintenancePage();
            case CLAIM:
                return new ClaimPage();
            case BUZZ:
                return new BuzzPage();
            default:
                return null;
        }
    }
}
