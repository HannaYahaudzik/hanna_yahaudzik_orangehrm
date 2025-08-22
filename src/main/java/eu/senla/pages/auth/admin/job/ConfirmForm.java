package eu.senla.pages.auth.admin.job;

import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

public class ConfirmForm {

    private final By confirmButton = By.xpath("//div[@class='oxd-dialog-container-default']//button[text()=' Yes, Delete ']");

    public final JobTitlesPage clickConfirmButton() {
        Wait.waitVisibilityOfElementLocated(confirmButton).click();
        return new JobTitlesPage();
    }

}
