package eu.senla.pageObject.login.homePage.pimPage;

import eu.senla.wait.Wait;
import org.openqa.selenium.By;

public class PimPage {

    /**
     * Locator for a button Add.
     */
    private final By addButton = By.xpath("//div[@class='orangehrm-header-container']/button");

    public final AddEmployeePage clickAddButton() {
        Wait.waitVisibilityOfElementLocated(addButton).click();
        return new AddEmployeePage();
    }
}
