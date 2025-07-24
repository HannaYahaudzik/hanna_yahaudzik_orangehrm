package eu.senla.appTest.auth.admin.job;

import eu.senla.enums.SidepanelMenu;
import eu.senla.general.BaseTest;
import eu.senla.pageObject.LoginPage;
import eu.senla.pageObject.auth.admin.AdminPage;
import eu.senla.pageObject.auth.admin.job.addJobTitle.AddJobTitlePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Objects;

@Tag("addJobTitle")
@DisplayName("Проверка формы добавления профессии")
public class AddJobTitleTest extends BaseTest {

    private AddJobTitlePage openAddJobTitlePage() {
        return ((AdminPage) Objects.requireNonNull(
                new LoginPage()
                        .loginValidUser()
                        .getSidepanelPage()
                        .clickMenu(SidepanelMenu.ADMIN)))
                .clickJobTitlesPage()
                .clickAddButton();
    }

    @Test
    @DisplayName("Проверка обязательных полей")
    public void testRequiredField() {
        Assertions.assertEquals(
                Collections.singletonList("Job Title"),
                openAddJobTitlePage()
                        .clickSaveButton()
                        .getRequiredFieldNameWithError()
        );
    }

}
