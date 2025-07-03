package eu.senla.pageObject.auth.recruitment.candidateProfile;

import eu.senla.utilities.Wait;
import eu.senla.webElement.Input;
import org.openqa.selenium.By;

public class CandidateProfilePage {

    private final By firstNameInput = By.name("firstName");
    private final By lastNameInput = By.name("lastName");
    private final Input emailInput = new Input("Email");

    public final String getFirstNameValue() {
        return Wait.waitVisibilityOfElementLocated(firstNameInput).getAttribute("value");
    }

    public final String getLastNameValue() {
        return Wait.waitVisibilityOfElementLocated(lastNameInput).getAttribute("value");
    }

    public final String getEmailValue() {
        return emailInput.getWebElement().getAttribute("value");
    }
}
