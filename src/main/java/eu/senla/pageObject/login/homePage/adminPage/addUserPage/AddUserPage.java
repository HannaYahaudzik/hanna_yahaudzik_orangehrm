package eu.senla.pageObject.login.homePage.adminPage.addUserPage;

import eu.senla.waits.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddUserPage {

    private final By userRoleDropdown = By.xpath(".//label[text()='User Role']/../..//div[text()='-- Select --']");
    // TODO change to Page Element Dropdown
    private final By userRoleAdminSelect = By.xpath(".//div/span[text()='Admin']");
    private final By employeeNameInput = By.xpath(".//label[text()='Employee Name']/../..//input");
    private final By statusDropdown = By.xpath(".//label[text()='Status']/../..//div[text()='-- Select --']");
    // TODO change to Page Element Dropdown
    private final By statusEnabledSelect = By.xpath(".//div/span[text()='Enabled']");
    private final By usernameInput = By.xpath(".//label[text()='Username']/../..//input");
    private final By passwordInput = By.xpath(".//label[text()='Password']/../..//input");
    private final By confirmPasswordInput = By.xpath(".//label[text()='Confirm Password']/../..//input");
    private final By saveButton = By.xpath(".//button[text()=' Save ']");

    public WebElement getUserRoleDropdown() {
        return Waits.waitVisibilityOfElementLocated(userRoleDropdown);
    }

    public WebElement getUserRoleAdminSelect() {
        return Waits.waitVisibilityOfElementLocated(userRoleAdminSelect);
    }

    public WebElement getEmployeeNameInput() {
        return Waits.waitVisibilityOfElementLocated(employeeNameInput);
    }

    public WebElement getStatusDropdown() {
        return Waits.waitVisibilityOfElementLocated(statusDropdown);
    }

    public WebElement getStatusEnabledSelect() {
        return Waits.waitVisibilityOfElementLocated(statusEnabledSelect);
    }

    public WebElement getUsernameInput() {
        return Waits.waitVisibilityOfElementLocated(usernameInput);
    }

    public WebElement getPasswordInput() {
        return Waits.waitVisibilityOfElementLocated(passwordInput);
    }

    public WebElement getConfirmPasswordInput() {
        return Waits.waitVisibilityOfElementLocated(confirmPasswordInput);
    }

    public WebElement getSaveButton() {
        return Waits.waitVisibilityOfElementLocated(saveButton);
    }


    public AddUserPage fillAddUserForm(String userRole, String employeeName, String status, String username, String password) {
        getUserRoleDropdown().click();
        getUserRoleAdminSelect().click();

//        getEmployeeNameInput().sendKeys(employeeName);

        getStatusDropdown().click();
        getStatusEnabledSelect().click();

        getUsernameInput().sendKeys(username);

        getPasswordInput().sendKeys(password);
        getConfirmPasswordInput().sendKeys(password);

        getSaveButton().click();

        return this;
    }

}
