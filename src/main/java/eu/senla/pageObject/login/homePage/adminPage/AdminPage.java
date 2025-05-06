package eu.senla.pageObject.login.homePage.adminPage;

import eu.senla.waits.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdminPage {
    private final By addButton = By.xpath(".//button[text()=' Add ']");

    public WebElement getAddButton() {
        return Waits.waitVisibilityOfElementLocated(addButton);
    }

    public AdminPage clickAddButton(){
        getAddButton().click();
        return new AdminPage();
    }
}
