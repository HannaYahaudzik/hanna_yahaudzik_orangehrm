package eu.senla.pageObject.auth;

import eu.senla.commonElement.Sidepanel;

public abstract class BaseAuthPage {

    private final Sidepanel sidepanel = new Sidepanel();

    public final Sidepanel getSidepanelPage() {
        return sidepanel;
    }
}
