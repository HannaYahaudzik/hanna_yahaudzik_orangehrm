package eu.senla.commonElement;

import eu.senla.pageObject.LoginPage;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;

public class Header {

    private final By userArea = By.xpath("//div[@class='oxd-topbar-header-userarea']");
    private final By logoutSelect = By.xpath("//div[@class='oxd-topbar-header-userarea']//li/a[contains(@href,'logout')]");

    public final LoginPage logout() {
        Wait.waitVisibilityOfElementLocated(userArea).click();
        Wait.waitVisibilityOfElementLocated(logoutSelect).click();
        return new LoginPage();
    }
}
