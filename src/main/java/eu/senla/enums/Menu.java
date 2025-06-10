package eu.senla.enums;

public enum Menu {

    ADMIN("viewAdminModule"),
    PIM("viewPimModule");

    private final String urlPart;

    Menu(final String urlPart) {
        this.urlPart = urlPart;
    }

    public String getUrlPart() {
        return urlPart;
    }
}
