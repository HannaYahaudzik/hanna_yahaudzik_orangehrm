package eu.senla.appTest.auth.admin.job;

import eu.senla.enums.SidepanelMenu;
import eu.senla.general.BaseTest;
import eu.senla.pages.auth.admin.AdminPage;
import eu.senla.pages.auth.admin.job.addJobTitle.AddJobTitlePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Collections;

@Tag("addJobTitle")
@DisplayName("Проверка формы добавления профессии")
public class AddJobTitleTest extends BaseTest {

    private AddJobTitlePage openPage() {
        return ((AdminPage) login()
                .getSidepanelPage()
                .clickMenu(SidepanelMenu.ADMIN))
                .clickJobTitlesPage()
                .clickAddButton();
    }

    @Test
    @DisplayName("Проверка обязательных полей")
    public void testRequiredField() {
        Assertions.assertEquals(
                Collections.singletonList("Job Title"),
                openPage()
                        .clickSaveButton()
                        .getRequiredFieldNameWithError()
        );
    }

}
