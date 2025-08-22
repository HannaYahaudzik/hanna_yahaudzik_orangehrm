package eu.senla.pages.auth.recruitment.addCandidate;

import eu.senla.entities.Candidate;
import eu.senla.pages.auth.recruitment.candidateProfile.CandidateProfilePage;
import eu.senla.utilities.Wait;
import eu.senla.customWebElements.Input;
import org.openqa.selenium.By;

public class AddCandidatePage {

    private final By firstNameInput = By.name("firstName");
    private final By middleNameInput = By.name("middleName");
    private final By lastNameInput = By.name("lastName");
    private final Input emailInput = new Input("Email");
    private final Input contactNumberInput = new Input("Contact Number");
    private final Input keywordsInput = new Input("Keywords");
    private final By saveButton = By.xpath("//button[@type='submit']");

    private AddCandidatePage enterFirstName(final String value) {
        Wait.waitVisibilityOfElementLocated(firstNameInput).sendKeys(value);
        return this;
    }

    private AddCandidatePage enterMiddleName(final String value) {
        Wait.waitVisibilityOfElementLocated(middleNameInput).sendKeys(value);
        return this;
    }

    private AddCandidatePage enterLastName(final String value) {
        Wait.waitVisibilityOfElementLocated(lastNameInput).sendKeys(value);
        return this;
    }

    private AddCandidatePage enterEmail(final String value) {
        emailInput.getWebElement().sendKeys(value);
        return this;
    }

    private AddCandidatePage enterContactNumber(final String value) {
        contactNumberInput.getWebElement().sendKeys(value);
        return this;
    }

    private AddCandidatePage enterKeywords(final String value) {
        keywordsInput.getWebElement().sendKeys(value);
        return this;
    }

    private AddCandidatePage clickSaveButton() {
        Wait.waitVisibilityOfElementLocated(saveButton).click();
        return this;
    }

    public final CandidateProfilePage submitAddCandidateForm(final Candidate candidate) {
        enterFirstName(candidate.getFirstName());
        enterLastName(candidate.getLastName());
        enterEmail(candidate.getEmail());
        clickSaveButton();
        return new CandidateProfilePage();
    }

    public final CandidateProfilePage submitAddCandidateWithAllArgs(final Candidate candidate) {
        enterFirstName(candidate.getFirstName());
        enterMiddleName(candidate.getMiddleName());
        enterLastName(candidate.getLastName());
        enterEmail(candidate.getEmail());
        enterContactNumber(candidate.getContactNumber());
        enterKeywords(candidate.getKeywords());
        clickSaveButton();
        return new CandidateProfilePage();
    }
}
