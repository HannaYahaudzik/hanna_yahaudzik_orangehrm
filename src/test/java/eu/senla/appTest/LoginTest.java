package eu.senla.appTest;

import eu.senla.driver.Driver;
import eu.senla.entities.User;
import eu.senla.general.BaseTest;
import eu.senla.pages.LoginPage;
import eu.senla.pages.auth.DashboardPage;
import eu.senla.utilities.GenerateFakeEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.params.provider.Arguments.arguments;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Проверка формы Логин")
@Tag("loginForm")
public class LoginTest extends BaseTest {

    @Test
    @Order(1)
    @Tag("smoke")
    @DisplayName("Проверка успешного логина с валидными данными")
    void loginSuccess() {
        DashboardPage page = new LoginPage().loginValidUser();
        assertAll(
                () -> assertEquals(DashboardPage.TITLE, page.getHeader().getTitlePage()),
                () -> assertTrue(Objects.requireNonNull(Driver.getInstance().getCurrentUrl()).contains(DashboardPage.URL))
        );
    }

    @Test
    @Order(2)
    @DisplayName("Проверка ошибки при входя с невалидными данными")
    public void loginInvalidUser() {
        assertEquals("Invalid credentials", new LoginPage().loginUser(GenerateFakeEntity.getUser()).getErrorMessage());
    }

    /**
     * @param expectedRequiredFieldName a list of expected required field name
     * @param user                      a user without filling all required fields
     */
    @ParameterizedTest(name = "{index} - Проверка обязательных полей: {1}")
    @Order(2)
    @MethodSource("requiredFieldData")
    public void testRequiredField(final List<String> expectedRequiredFieldName, final User user) {
        assertEquals(
                expectedRequiredFieldName,
                new LoginPage().loginUser(user).getRequiredFieldNameWithError(),
                generateFailMessage(expectedRequiredFieldName, user)
        );
    }

    private static Stream<Arguments> requiredFieldData() {
        return Stream.of(
                arguments(Arrays.asList("username", "password"), User.builder().username("").password("").build()),
                arguments(Collections.singletonList("password"), User.builder().username("username").password("").build()),
                arguments(Collections.singletonList("username"), User.builder().username("").password("password").build())
        );
    }

    private static String generateFailMessage(final List<String> fieldName, final User user) {
        return "Fail test for a checking required field names: " + fieldName
                + ". User was: " + user.toString();
    }
}
