package eu.senla.enums;

public enum SidepanelMenu {

    ADMIN("viewAdminModule"),
    PIM("viewPimModule"),
    LEAVE("viewLeaveModule"),
    TIME("viewTimeModule"),
    RECRUITMENT("viewRecruitmentModule"),
    MY_INFO("viewMyDetails"),
    PERFORMANCE("viewPerformanceModule"),
    DASHBOARD("dashboard/index"),
    DIRECTORY("viewDirectory"),
    MAINTENANCE("viewMaintenanceModule"),
    CLAIM("viewClaimModule"),
    BUZZ("viewBuzz");

    private final String urlPart;

    SidepanelMenu(final String urlPart) {
        this.urlPart = urlPart;
    }

    public String getUrlPart() {
        return urlPart;
    }
}
