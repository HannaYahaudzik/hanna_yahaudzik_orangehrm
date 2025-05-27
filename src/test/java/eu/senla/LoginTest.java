package eu.senla;

import eu.senla.driver.Driver;
import eu.senla.entity.User;
import eu.senla.general.BaseTest;
import eu.senla.pageObject.login.LoginPage;
import org.junit.jupiter.api.Assertions;
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
import java.util.stream.Stream;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Проверка формы Логин")
public class LoginTest extends BaseTest {

    @Test
    @Tag("smoke")
    @Order(1)
    @DisplayName("Проверка успешного логина с валидными данными")
    public void loginSuccess() {
        new LoginPage().loginValidUser().getPageHeader();
        Assertions.assertTrue(Driver.getInstance().getCurrentUrl().contains("/dashboard/index"));
    }

    @Test
    @Order(2)
    @DisplayName("Проверка ошибки при входя с невалидными данными")
    public void loginInvalidUser() {
        Assertions.assertEquals("Invalid credentials", new LoginPage().loginFakerUser().getErrorMessage());
    }

    /**
     *
     * @param expectedRequiredFieldName a list of expected required field name
     * @param user a user without filling all required fields
     */
    @ParameterizedTest(name = "{index} - Проверка обязательных полей: {1}")
    @Order(2)
    @MethodSource("requiredFieldData")
    public void testRequiredField(final List<String> expectedRequiredFieldName, final User user) {
        Assertions.assertEquals(expectedRequiredFieldName, new LoginPage().loginUser(user).getRequiredFieldNameWithError());
    }

    static Stream<Arguments> requiredFieldData() {
        return Stream.of(
                Arguments.arguments(Arrays.asList("username", "password"), User.builder().username("").password("").build()),
                Arguments.arguments(Collections.singletonList("password"), User.builder().username("username").password("").build()),
                Arguments.arguments(Collections.singletonList("username"), User.builder().username("").password("password").build())
        );
    }
}
