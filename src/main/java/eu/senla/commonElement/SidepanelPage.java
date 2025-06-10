package eu.senla.commonElement;

import eu.senla.enums.Menu;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class SidepanelPage {

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

    public final void clickMenu(final Menu menuPoint) {
        Wait.waitVisibilityOfElementLocated(By.cssSelector(getMenuCssSelector(menuPoint.getUrlPart()))).click();
    }
}
