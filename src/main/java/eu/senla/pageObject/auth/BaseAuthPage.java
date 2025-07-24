package eu.senla.pageObject.auth;

import eu.senla.commonElement.Sidepanel;
import eu.senla.pageObject.BasePage;

public abstract class BaseAuthPage extends BasePage {

    private final Sidepanel sidepanel = new Sidepanel();

    public final Sidepanel getSidepanelPage() {
        return sidepanel;
    }
}
