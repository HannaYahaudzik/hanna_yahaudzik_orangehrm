package eu.senla.pageObject.login.homePage;

import eu.senla.pageObject.login.homePage.adminPage.AdminPage;
import eu.senla.waits.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final By adminMenuBy = By.xpath(".//span[text()='Admin']");

    public WebElement getAdminMenu() {
        return Waits.waitVisibilityOfElementLocated(adminMenuBy);
    }

    public AdminPage clickAdminMenu(){
        getAdminMenu().click();
        return new AdminPage();
    }

}
