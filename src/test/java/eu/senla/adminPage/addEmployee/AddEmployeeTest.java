package eu.senla.adminPage.addEmployee;

import eu.senla.general.BaseTest;
import eu.senla.pageObject.login.LoginPage;
import org.junit.jupiter.api.Test;

public class AddEmployeeTest extends BaseTest {

    @Test
    public void addEmployee() {
        new LoginPage()
                .loginValidUser()
                .clickPimMenu()
                .clickAddButton()
                .fillAddEmployeeForm("Test first name", "Test middle name", "Test last name");
    }
}
