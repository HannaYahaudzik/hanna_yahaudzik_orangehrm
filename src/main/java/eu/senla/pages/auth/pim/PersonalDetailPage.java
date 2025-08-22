package eu.senla.pages.auth.pim;

import eu.senla.pages.auth.BaseAuthPage;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

public class PersonalDetailPage extends BaseAuthPage {

    private final By firstNameBy = By.name("firstName");
    private final By middleNameBy = By.name("middleName");
    private final By lastNameBy = By.name("lastName");

    public final String getFirstNameValue() {
        return Wait.waitVisibilityOfElementLocated(firstNameBy).getAttribute("value");
    }

    public final String getMiddleNameValue() {
        return Wait.waitVisibilityOfElementLocated(middleNameBy).getAttribute("value");
    }

    public final String getLastNameValue() {
        return Wait.waitVisibilityOfElementLocated(lastNameBy).getAttribute("value");
    }
}
