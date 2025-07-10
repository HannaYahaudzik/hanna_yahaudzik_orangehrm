package eu.senla.pageObject.auth.recruitment;

import eu.senla.pageObject.auth.BaseAuthPage;
import eu.senla.pageObject.auth.recruitment.addCandidate.AddCandidatePage;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

public class RecruitmentPage extends BaseAuthPage {

    private final By addButton = By.xpath("//div[@class='orangehrm-header-container']/button");

    public final AddCandidatePage clickToAddButton() {
        Wait.waitVisibilityOfElementLocated(addButton).click();
        return new AddCandidatePage();
    }
}
