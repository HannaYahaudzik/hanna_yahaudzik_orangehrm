package eu.senla.pages.auth;

import eu.senla.commonElements.Sidepanel;
import eu.senla.pages.BasePage;

public abstract class BaseAuthPage extends BasePage {

    private final Sidepanel sidepanel = new Sidepanel();

    public final Sidepanel getSidepanelPage() {
        return sidepanel;
    }
}
