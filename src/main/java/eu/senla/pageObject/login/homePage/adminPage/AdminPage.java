package eu.senla.pageObject.login.homePage.adminPage;

import org.openqa.selenium.By;

public class AdminPage {

  private final By userRoleDropdownBy =
      By.xpath(".//label[text()='User Role']/../..//div[text()='-- Select --']");
  private final By searchButtonBy = By.xpath(".//button[text()=' Search ']");
  private final By addButtonBy = By.xpath(".//button[text()=' Add ']");
}
