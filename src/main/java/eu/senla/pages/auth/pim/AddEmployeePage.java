package eu.senla.pages.auth.pim;

import eu.senla.entities.Employee;
import eu.senla.pages.auth.BaseAuthPage;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

public class AddEmployeePage extends BaseAuthPage {

    private final By firstNameBy = By.name("firstName");
    private final By middleNameBy = By.name("middleName");
    private final By lastNameBy = By.name("lastName");
    private final By saveButtonBy = By.xpath(".//button[text()=' Save ']");

    public final AddEmployeePage enterFirstName(final String value) {
        Wait.waitVisibilityOfElementLocated(firstNameBy).sendKeys(value);
        return this;
    }

    public final AddEmployeePage enterMiddleName(final String value) {
        Wait.waitVisibilityOfElementLocated(middleNameBy).sendKeys(value);
        return this;
    }

    public final AddEmployeePage enterLastName(final String value) {
        Wait.waitVisibilityOfElementLocated(lastNameBy).sendKeys(value);
        return this;
    }

    public final AddEmployeePage clickSaveButton() {
        Wait.waitVisibilityOfElementLocated(saveButtonBy).click();
        return this;
    }

    public final PersonalDetailPage enterAddEmployeeForm(final Employee employee) {
        enterFirstName(employee.getFirstName());
        enterMiddleName(employee.getMiddleName());
        enterLastName(employee.getLastName());
        clickSaveButton();
        return new PersonalDetailPage();
    }
}
