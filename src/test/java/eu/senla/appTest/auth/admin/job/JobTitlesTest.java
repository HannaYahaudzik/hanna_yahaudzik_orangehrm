package eu.senla.appTest.auth.admin.job;

import com.github.javafaker.Faker;
import eu.senla.driver.Driver;
import eu.senla.enums.SidepanelMenu;
import eu.senla.general.BaseTest;
import eu.senla.pages.auth.admin.AdminPage;
import eu.senla.pages.auth.admin.job.JobTitlesPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("jobTitles")
@DisplayName("Проверка добавления и удаления профессии")
public class JobTitlesTest extends BaseTest {

    private static String jobTitleName;

    @BeforeAll
    public static void setJob() {
        jobTitleName = new Faker().job().title();
    }

    private JobTitlesPage openPage() {
        return ((AdminPage) login()
                .getSidepanelPage()
                .clickMenu(SidepanelMenu.ADMIN))
                .clickJobTitlesPage();
    }

    @Test
    @Order(1)
    @Tags(value = {@Tag("smoke")})
    @DisplayName("Проверка перехода на страницу через UI")
    public void checkUserPathToPage() {
        assertAll(
                () -> assertEquals("Admin / Job", openPage().getPageHeader()),
                () -> assertTrue(Objects.requireNonNull(Driver.getInstance().getCurrentUrl()).contains("admin/viewJobTitleList"))
        );
    }

    @Test
    @Order(1)
    @Tags(value = {@Tag("smoke")})
    @DisplayName("Проверка добавления работы")
    public void addJob() {
        JobTitlesPage jobTitlesPage = openPage()
                .clickAddButton()
                .submitFormFaker(jobTitleName);
        Assertions.assertTrue(jobTitlesPage.isJobExist(jobTitleName));
    }

    @Test
    @Order(2)
    @Tags(value = {@Tag("smoke")})
    @DisplayName("Проверка удаления работы")
    public void removeJob() {
        JobTitlesPage jobTitlesPage = openPage()
                .removeJob(jobTitleName)
                .clickConfirmButton();
        Assertions.assertFalse(jobTitlesPage.isJobExist(jobTitleName));
    }
}
