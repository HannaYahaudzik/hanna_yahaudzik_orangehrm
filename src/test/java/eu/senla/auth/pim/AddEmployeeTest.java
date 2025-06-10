package eu.senla.auth.pim;

import eu.senla.enums.SidepanelMenu;
import eu.senla.general.BaseTest;
import eu.senla.pageObject.login.LoginPage;
import eu.senla.pageObject.login.auth.pim.PimPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import java.util.Objects;

@Tag("addEmployee")
@DisplayName("Проверка формы добавления сотрудника")
public class AddEmployeeTest extends BaseTest {

    @Test
    @Tags(value = {@Tag("smoke")})
    @DisplayName("Проверка заполнения формы добавления сотрудника")
    public void addEmployee() {
        ((PimPage) Objects.requireNonNull(
                new LoginPage()
                        .loginValidUser()
                        .getSidepanelPage()
                        .clickMenu(SidepanelMenu.PIM)))
                .clickAddEmployeeButton()
                .fillAddEmployeeForm("Test first name", "Test middle name", "Test last name");
    }
}
