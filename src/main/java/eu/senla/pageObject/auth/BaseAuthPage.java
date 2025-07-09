package eu.senla.pageObject.auth;

import eu.senla.commonElement.Header;
import eu.senla.commonElement.Sidepanel;

public abstract class BaseAuthPage {

    private final Sidepanel sidepanel = new Sidepanel();

    private final Header header = new Header();

    public final Sidepanel getSidepanelPage() {
        return sidepanel;
    }

    public final Header getHeader() {
        return header;
    }
}
