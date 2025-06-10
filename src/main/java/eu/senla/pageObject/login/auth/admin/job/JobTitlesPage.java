package eu.senla.pageObject.login.auth.admin.job;

import eu.senla.pageObject.login.auth.BaseAuthPage;
import eu.senla.utilities.Wait;
import eu.senla.webElement.TableCard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JobTitlesPage extends BaseAuthPage {

    private final By addButton = By.xpath("//button[text()=' Add ']");

    public final AddJobTitlePage clickAddButton() {
        Wait.waitVisibilityOfElementLocated(addButton).click();
        return new AddJobTitlePage();
    }

    public final WebElement findByJobTitle(final String jobTitleName) {
        return new TableCard(jobTitleName).getWebElement();
    }
}
