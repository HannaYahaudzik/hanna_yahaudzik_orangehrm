package eu.senla.auth.admin.job;

import com.github.javafaker.Faker;
import eu.senla.enums.SidepanelMenu;
import eu.senla.general.BaseTest;
import eu.senla.pageObject.login.LoginPage;
import eu.senla.pageObject.login.auth.admin.AdminPage;
import eu.senla.pageObject.login.auth.admin.job.JobTitlesPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import java.util.Objects;

@Tag("jobTitles")
@DisplayName("Проверка формы добавления профессии")
public class AddJobTitleTest extends BaseTest {

    @Test
    @Tags(value = {@Tag("smoke")})
    @DisplayName("Проверка добавления работы")
    public void addJob() {
        String jobTitleName = new Faker().job().title();
        JobTitlesPage jobTitlesPage = ((AdminPage) Objects.requireNonNull(
                new LoginPage()
                        .loginValidUser()
                        .getSidepanelPage()
                        .clickMenu(SidepanelMenu.ADMIN)))
                .clickJobTitlesPage()
                .clickAddButton()
                .submitFormFaker(jobTitleName);
        Assertions.assertNotNull(jobTitlesPage.findByJobTitle(jobTitleName));
    }
}
