package eu.senla.pageObject.auth.admin;

import eu.senla.pageObject.auth.BaseAuthPage;
import eu.senla.pageObject.auth.admin.job.JobTitlesPage;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

public class AdminPage extends BaseAuthPage {

    private final By jobDropdown = By.xpath("//header/div/nav/ul/li/span[text()='Job ']");
    private final By jobTitlesSelect = By.xpath("//header/div/nav/ul/li/ul/li/a[text()='Job Titles']");

    public final JobTitlesPage clickJobTitlesPage() {
        Wait.waitVisibilityOfElementLocated(jobDropdown).click();
        Wait.waitVisibilityOfElementLocated(jobTitlesSelect).click();
        return new JobTitlesPage();
    }
}
