package eu.senla.pageObject.auth.admin.job;

import eu.senla.pageObject.auth.BaseAuthPage;
import eu.senla.pageObject.auth.admin.job.addJobTitle.AddJobTitlePage;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

public class JobTitlesPage extends BaseAuthPage {

    private final JobTitleTable jobTitleTable;

    private final By addButton = By.xpath("//button[text()=' Add ']");

    public JobTitlesPage() {
        this.jobTitleTable = new JobTitleTable();
    }

    public final AddJobTitlePage clickAddButton() {
        Wait.waitVisibilityOfElementLocated(addButton).click();
        return new AddJobTitlePage();
    }

    public final Boolean isJobExist(final String jobTitleName) {
        return jobTitleTable.isRowExist(jobTitleName);
    }

    public final ConfirmForm removeJob(final String jobTitleName) {
        return jobTitleTable.getRow(jobTitleName).clickToActionRemove();
    }
}
