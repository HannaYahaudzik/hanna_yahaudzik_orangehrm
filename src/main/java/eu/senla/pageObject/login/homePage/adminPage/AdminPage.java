package eu.senla.pageObject.login.homePage.adminPage;

import eu.senla.pageObject.login.homePage.adminPage.addUserPage.AddUserPage;
import eu.senla.waits.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdminPage {

    private final By addButton = By.xpath(".//button[text()=' Add ']");

    public WebElement getAddButton() {
        return Waits.waitVisibilityOfElementLocated(addButton);
    }

    public AddUserPage clickAddButton(){
        getAddButton().click();
        return new AddUserPage();
    }
}
