package eu.senla.adminPage.addEmployee;

import eu.senla.general.GeneralTest;
import eu.senla.pageObject.login.LoginPage;
import org.junit.jupiter.api.Test;

public class AddEmployeeTest extends GeneralTest {

    @Test
    public void addEmployee() {

        new LoginPage()
                .loginValidUser()
                .clickAdminMenu()
                .clickAddButton();

    }
}
