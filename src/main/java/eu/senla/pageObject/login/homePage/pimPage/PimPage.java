package eu.senla.pageObject.login.homePage.pimPage;

import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

public class PimPage {

    private final By addEmployeeButton = By.xpath("//div[@class='orangehrm-header-container']/button");

    public final AddEmployeePage clickAddEmployeeButton() {
        Wait.waitVisibilityOfElementLocated(addEmployeeButton).click();
        return new AddEmployeePage();
    }
}
