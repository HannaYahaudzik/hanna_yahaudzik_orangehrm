package eu.senla.adminPage.addEmployee;

import eu.senla.general.BaseTest;
import eu.senla.pageObject.login.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Проверка формы добавления сотрудника")
public class AddEmployeeTest extends BaseTest {

    @Test
    @Tag("smoke")
    @DisplayName("Проверка заполнения формы добавления сотрудника")
    public void addEmployee() {
        new LoginPage()
                .loginValidUser()
                .clickPimMenu()
                .clickAddButton()
                .fillAddEmployeeForm("Test first name", "Test middle name", "Test last name");
    }
}
