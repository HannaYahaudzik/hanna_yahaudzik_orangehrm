package eu.senla.pageObject.login.homePage.adminPage;

import org.openqa.selenium.By;

public class AdminPage {

    /**
     * Locator for a dropdown UserRole.
     */
    private final By userRoleDropdownBy = By.xpath(".//label[text()='User Role']/../..//div[text()='-- Select --']");
    /**
     * Locator for a button Search.
     */
    private final By searchButtonBy = By.xpath(".//button[text()=' Search ']");
    /**
     * Locator for a button Add.
     */
    private final By addButtonBy = By.xpath(".//button[text()=' Add ']");
}
