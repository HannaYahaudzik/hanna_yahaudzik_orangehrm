package eu.senla.pages.auth.admin.job.addJobTitle;

import eu.senla.driver.Driver;
import eu.senla.pages.auth.BaseAuthPage;
import eu.senla.pages.auth.admin.job.JobTitlesPage;
import eu.senla.customWebElements.Input;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class AddJobTitlePage extends BaseAuthPage {

    private final Input jobTitleInput = new Input("Job Title");
    private final By saveButton = By.xpath("//button[text()=' Save ']");

    private final By requiredText = By.className("oxd-input-field-error-message");
    private final By errorInput = By.xpath("//input[contains(@class,'oxd-input--error')]/ancestor::div/div/label");

    public final AddJobTitlePage enterJobTitleInput(final String value) {
        jobTitleInput.getWebElement().sendKeys(value);
        return this;
    }

    public final AddJobTitlePage clickSaveButton() {
        Wait.waitVisibilityOfElementLocated(saveButton).click();
        return this;
    }

    public final AddJobTitlePage enterForm(final String jobTitle) {
        enterJobTitleInput(jobTitle);
        clickSaveButton();
        return this;
    }

    public final JobTitlesPage submitFormFaker(final String jobTitle) {
        enterForm(jobTitle);
        return new JobTitlesPage();
    }


    public final String getRequiredText() {
        return Wait.waitVisibilityOfElementLocated(requiredText).getText();
    }

    public final List<String> getRequiredFieldNameWithError() {
        getRequiredText();
        return Driver.getInstance().findElements(errorInput).stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

}
