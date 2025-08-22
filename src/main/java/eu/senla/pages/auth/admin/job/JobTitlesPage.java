package eu.senla.pages.auth.admin.job;

import eu.senla.pages.auth.BaseAuthPage;
import eu.senla.pages.auth.admin.job.addJobTitle.AddJobTitlePage;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

public class JobTitlesPage extends BaseAuthPage {

    private final JobTitleTable jobTitleTable;

    private final By addButton = By.xpath("//button[text()=' Add ']");

    private final By pageHeaderModuleBy = By.className("oxd-topbar-header-breadcrumb-module");
    private final By pageHeaderLevelBy = By.className("oxd-topbar-header-breadcrumb-level");

    public JobTitlesPage() {
        this.jobTitleTable = new JobTitleTable();
    }

    public final String getPageHeader() {
        return Wait.waitVisibilityOfElementLocated(pageHeaderModuleBy).getText() + " / "
                + Wait.waitVisibilityOfElementLocated(pageHeaderLevelBy).getText();
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
