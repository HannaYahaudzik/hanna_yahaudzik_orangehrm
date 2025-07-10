package eu.senla.auth.pim;

import eu.senla.entity.Employee;
import eu.senla.enums.SidepanelMenu;
import eu.senla.general.BaseTest;
import eu.senla.pageObject.LoginPage;
import eu.senla.pageObject.auth.pim.PersonalDetailPage;
import eu.senla.pageObject.auth.pim.PimPage;
import eu.senla.utilities.GenerateFakeEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;


@Tag("addEmployee")
@DisplayName("Проверка формы добавления сотрудника")
public class AddEmployeeTest extends BaseTest {

    @Test
    @Tags(value = {@Tag("smoke")})
    @DisplayName("Проверка заполнения формы добавления сотрудника")
    public void addEmployee() {
        Employee employee = GenerateFakeEntity.getEmployee();
        PersonalDetailPage personalDetailPage = ((PimPage)
                new LoginPage()
                        .loginValidUser()
                        .getSidepanelPage()
                        .clickMenu(SidepanelMenu.PIM))
                .clickAddEmployeeButton()
                .enterAddEmployeeForm(employee);
        Assertions.assertAll(
                () -> Assertions.assertEquals(employee.getFirstName(), personalDetailPage.getFirstNameValue()),
                () -> Assertions.assertEquals(employee.getMiddleName(), personalDetailPage.getMiddleNameValue()),
                () -> Assertions.assertEquals(employee.getLastName(), personalDetailPage.getLastNameValue())
        );
    }
}
