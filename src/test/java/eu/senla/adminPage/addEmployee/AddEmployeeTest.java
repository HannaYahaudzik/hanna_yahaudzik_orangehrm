package eu.senla.adminPage.addEmployee;

import eu.senla.general.BaseTest;
import eu.senla.pageObject.login.LoginPage;
import org.junit.jupiter.api.Test;

public class AddEmployeeTest extends BaseTest {

    @Test
    public void addEmployee() {
        new LoginPage()
                .loginValidUser()
                .clickAdminMenu()
                .clickAddButton()
                .fillAddUserForm("Admin", "Orange  Test", "Enabled",
                        "Test Username", "Pa$$w0rd");

    }
}
