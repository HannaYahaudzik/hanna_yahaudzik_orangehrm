package eu.senla.pageObject.login.homePage;

import eu.senla.pageObject.login.homePage.adminPage.AdminPage;
import eu.senla.pageObject.login.homePage.pimPage.PimPage;
import eu.senla.wait.Wait;
import org.openqa.selenium.By;

public class HomePage {

  /**
   * Locator for a point 'Admin' into menu.
   */
  private final By adminMenuBy = By.xpath(".//span[text()='Admin']");

  /**
   * Locator for a point 'PIM' into menu.
   */
  private final By pimMenuBy = By.xpath(".//span[text()='PIM']");

  public final AdminPage clickAdminMenu() {
    Wait.waitVisibilityOfElementLocated(adminMenuBy).click();
    return new AdminPage();
  }

  public final PimPage clickPimMenu() {
    Wait.waitVisibilityOfElementLocated(pimMenuBy).click();
    return new PimPage();
  }
}
