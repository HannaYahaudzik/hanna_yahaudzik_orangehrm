package eu.senla.pages.auth;

import eu.senla.commonElements.Header;
import eu.senla.commonElements.Sidepanel;
import eu.senla.pages.BasePage;

public abstract class BaseAuthPage extends BasePage {

    private final Sidepanel sidepanel = new Sidepanel();

    private final Header header = new Header();

    public final Sidepanel getSidepanelPage() {
        return sidepanel;
    }

    public final Header getHeader() {
        return header;
    }
}
