package eu.senla.pageObject.login.commonElement;

import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

public class SidepanelPage {

    /**
     * Locator for a Search field.
     */
    private final By searchInput = RelativeLocator.with(By.className("oxd-main-menu-search")).below(By.tagName("input"));

    /**
     * Locator for a Search button.
     */
    private final By searchButton = RelativeLocator.with(By.className("oxd-main-menu-search")).below(By.tagName("button"));

    /**
     * Locator for a menu. Admin.
     */
    private final By menuAdmin = RelativeLocator.with(By.className("oxd-main-menu")).below(By.cssSelector("a[href*='viewAdminModule']"));

    /**
     * Locator for a menu. PIM.
     */
    private final By menuPim = RelativeLocator.with(By.className("oxd-main-menu")).below(By.cssSelector("a[href*='viewPimModule']"));

    /**
     * Locator for a hide menu button.
     */
    private final By hideMenuButton = By.className("oxd-main-menu-button");
}
