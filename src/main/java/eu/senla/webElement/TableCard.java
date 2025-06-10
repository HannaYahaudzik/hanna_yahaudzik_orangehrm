package eu.senla.webElement;

public class TableCard extends BaseCustomElement {

    public TableCard(final String name) {
        super(name);
    }

    final String getXpathExpression() {
        return "//div[@class='oxd-table-card']//div[text()='" + super.getName() + "']";
    }
}
