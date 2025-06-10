package eu.senla.enums;

public enum Menu {

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

    Menu(final String urlPart) {
        this.urlPart = urlPart;
    }

    public String getUrlPart() {
        return urlPart;
    }
}
