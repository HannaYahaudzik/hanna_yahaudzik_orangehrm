package eu.senla.pageObject.login.auth.admin.job;

import eu.senla.webElement.Input;
import eu.senla.pageObject.login.auth.BaseAuthPage;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

public class AddJobTitlePage extends BaseAuthPage {

    private final Input jobTitleInput = new Input("Job Title");
    private final By saveButton = By.xpath("//button[text()=' Save ']");

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

}
