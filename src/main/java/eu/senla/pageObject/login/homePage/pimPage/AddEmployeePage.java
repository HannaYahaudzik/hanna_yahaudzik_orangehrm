package eu.senla.pageObject.login.homePage.pimPage;

import eu.senla.wait.Wait;
import org.openqa.selenium.By;

public class AddEmployeePage {

    /**
     * Locator for an input First name.
     */
    private final By firstNameBy = By.name("firstName");
    /**
     * Locator for an input Middle name.
     */
    private final By middleNameBy = By.name("middleName");
    /**
     * Locator for an input Last name.
     */
    private final By lastNameBy = By.name("lastName");
    /**
     * Locator for a button Save.
     */
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
