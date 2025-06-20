package eu.senla.pageObject.login.commonElement;

import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

public class SidepanelPage {

    private final By searchInput = RelativeLocator.with(By.className("oxd-main-menu-search")).below(By.tagName("input"));
    private final By searchButton = RelativeLocator.with(By.className("oxd-main-menu-search")).below(By.tagName("button"));
    private final By menuAdmin = RelativeLocator.with(By.className("oxd-main-menu")).below(By.cssSelector("a[href*='viewAdminModule']"));
    private final By menuPim = RelativeLocator.with(By.className("oxd-main-menu")).below(By.cssSelector("a[href*='viewPimModule']"));
    private final By hideMenuButton = By.className("oxd-main-menu-button");
}
