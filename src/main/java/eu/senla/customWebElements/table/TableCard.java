package eu.senla.customWebElements.table;

import eu.senla.customWebElements.BaseCustomElement;
import org.openqa.selenium.By;

public abstract class TableCard extends BaseCustomElement {

    public TableCard(final String name) {
        super(name);
    }

    protected final String getRowXpath() {
        return "//div[@class='oxd-table-card']//div[text()='"
                + super.getName()
                + "']/ancestor::div[contains(@class,'row')]";
    }

    protected final By getBy() {
        return By.xpath(getRowXpath());
    }

}
