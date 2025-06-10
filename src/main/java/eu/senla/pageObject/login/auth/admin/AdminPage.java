package eu.senla.pageObject.login.auth.admin;

import eu.senla.pageObject.login.auth.BaseAuthPage;
import org.openqa.selenium.By;

public class AdminPage extends BaseAuthPage {

    private final By userRoleDropdownBy = By.xpath(".//label[text()='User Role']/../..//div[text()='-- Select --']");
    private final By searchButtonBy = By.xpath(".//button[text()=' Search ']");
    private final By addButtonBy = By.xpath(".//button[text()=' Add ']");
}
