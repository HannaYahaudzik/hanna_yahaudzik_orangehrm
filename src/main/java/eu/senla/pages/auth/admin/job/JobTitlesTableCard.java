package eu.senla.pages.auth.admin.job;

import eu.senla.utilities.Wait;
import eu.senla.customWebElements.table.TableCard;
import org.openqa.selenium.By;

public class JobTitlesTableCard extends TableCard {

    public JobTitlesTableCard(final String name) {
        super(name);
    }

    private String getRemoveActionXpath() {
        return getRowXpath() + "//div[contains(@class,'actions')]//i[contains(@class,'bi-trash')]/..";
    }

    private By getRemoveAction() {
        return By.xpath(getRemoveActionXpath());
    }

    public final ConfirmForm clickToActionRemove() {
        Wait.waitVisibilityOfElementLocated(getRemoveAction()).click();
        return new ConfirmForm();
    }


}
