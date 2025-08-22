package eu.senla.commonElement;

import eu.senla.pageObject.LoginPage;
import eu.senla.utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.stream.Collectors;

public class Header {

    private final By titlePage = By.cssSelector(".oxd-topbar-header-breadcrumb>h6");

    private final By userArea = By.xpath("//div[@class='oxd-topbar-header-userarea']");
    private final By logoutSelect = By.xpath("//div[@class='oxd-topbar-header-userarea']//li/a[contains(@href,'logout')]");

    public final String getTitlePage() {
    return Wait.waitVisibilityListOfElements(titlePage)
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.joining("/"));
    }

    public final LoginPage logout() {
        Wait.waitVisibilityOfElementLocated(userArea).click();
        Wait.waitVisibilityOfElementLocated(logoutSelect).click();
        return new LoginPage();
    }
}
