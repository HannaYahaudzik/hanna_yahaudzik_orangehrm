package eu.senla.webElement;

public class Input extends BaseCustomElement {

    public Input(final String name) {
        super(name);
    }

    final String getXpathExpression() {
        return "//form//label[text()='" + super.getName() + "']/../../div/input";
    }
}
