package eu.senla.appTest.auth;

import eu.senla.driver.Driver;
import eu.senla.general.BaseTest;
import eu.senla.pages.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("logout")
@DisplayName("Проверка logout")
public class LogoutTest extends BaseTest {
    @Test
    @DisplayName("Проверка logout")
    public void checkLogout() {
        LoginPage loginPage = new LoginPage()
                .loginValidUser()
                .getHeader()
                .logout();

        assertAll(
                () -> assertEquals("Login", loginPage.getTitle()),
                () -> assertTrue(Objects.requireNonNull(Driver.getInstance().getCurrentUrl()).contains("/auth/login"))
        );
    }
}
