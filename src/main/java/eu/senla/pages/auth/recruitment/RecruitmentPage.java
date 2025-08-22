package eu.senla.pages.auth.recruitment;

import eu.senla.pages.auth.BaseAuthPage;
import eu.senla.pages.auth.recruitment.addCandidate.AddCandidatePage;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

public class RecruitmentPage extends BaseAuthPage {

    private final By addButton = By.xpath("//div[@class='orangehrm-header-container']/button");

    public final AddCandidatePage clickToAddButton() {
        Wait.waitVisibilityOfElementLocated(addButton).click();
        return new AddCandidatePage();
    }
}
