package eu.senla.webElement.table;

import eu.senla.driver.Driver;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class Table {

    private final By table = By.className("oxd-table-card");

    public final WebElement getTable() {
        return Wait.waitVisibilityOfElementLocated(table);
    }

    public abstract TableCard getRow(String name);

    public final boolean isRowExist(final String name) {
        getTable();
        return !Driver.getInstance().findElements(getRow(name).getBy()).isEmpty();
    }
}
