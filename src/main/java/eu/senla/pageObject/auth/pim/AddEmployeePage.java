package eu.senla.pageObject.auth.pim;

import eu.senla.pageObject.auth.BaseAuthPage;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

public class AddEmployeePage extends BaseAuthPage {

    private final By firstNameBy = By.name("firstName");
    private final By middleNameBy = By.name("middleName");
    private final By lastNameBy = By.name("lastName");
    private final By saveButtonBy = By.xpath(".//button[text()=' Save ']");

    public final PersonalDetailPage fillAddEmployeeForm(
            final String firstname, final String middlename, final String lastname) {
        Wait.waitVisibilityOfElementLocated(firstNameBy).sendKeys(firstname);
        Wait.waitVisibilityOfElementLocated(middleNameBy).sendKeys(middlename);
        Wait.waitVisibilityOfElementLocated(lastNameBy).sendKeys(lastname);
        Wait.waitVisibilityOfElementLocated(saveButtonBy).click();
        return new PersonalDetailPage();
    }
}
