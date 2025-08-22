package eu.senla.pages.auth.recruitment.candidateProfile;

import eu.senla.utilities.Wait;
import eu.senla.customWebElements.Input;
import org.openqa.selenium.By;

public class CandidateProfilePage {

    private final By firstNameInput = By.name("firstName");
    private final By middleNameInput = By.name("middleName");
    private final By lastNameInput = By.name("lastName");
    private final Input emailInput = new Input("Email");
    private final Input contactNumberInput = new Input("Contact Number");
    private final Input keywordsInput = new Input("Keywords");

    public final String getFirstNameValue() {
        return Wait.waitVisibilityOfElementLocated(firstNameInput).getAttribute("value");
    }

    public final String getMiddleNameValue() {
        return Wait.waitVisibilityOfElementLocated(middleNameInput).getAttribute("value");
    }

    public final String getLastNameValue() {
        return Wait.waitVisibilityOfElementLocated(lastNameInput).getAttribute("value");
    }

    public final String getEmailValue() {
        return emailInput.getWebElement().getAttribute("value");
    }

    public final String getContactNumberValue() {
        return contactNumberInput.getWebElement().getAttribute("value");
    }

    public final String getKeywordsValue() {
        return keywordsInput.getWebElement().getAttribute("value");
    }
}
