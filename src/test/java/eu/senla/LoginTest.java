package eu.senla;

import eu.senla.driver.Driver;
import eu.senla.entity.User;
import eu.senla.general.BaseTest;
import eu.senla.pageObject.login.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class LoginTest extends BaseTest {

    @Test
    public void loginSuccess() {
        new LoginPage().loginValidUser().getPageHeader();
        Assertions.assertTrue(Driver.getInstance().getCurrentUrl().contains("/dashboard/index"));
    }

    @Test
    public void loginInvalidUser() {
        Assertions.assertEquals("Invalid credentials", new LoginPage().loginFakerUser().getErrorMessage());
    }

    /**
     *
     * @param user
     * @param expectedRequiredFieldName
     */
    @ParameterizedTest
    @MethodSource("requiredFieldData")
    public void testRequiredField(final User user, final List<String> expectedRequiredFieldName) {
        Assertions.assertEquals(expectedRequiredFieldName, new LoginPage().loginUser(user).getRequiredFieldNameWithError());
    }

    static Stream<Arguments> requiredFieldData() {
        return Stream.of(
                Arguments.arguments(new User.UserBuilder().username("").password("").build(), Arrays.asList("username", "password")),
                Arguments.arguments(new User.UserBuilder().username("username").password("").build(), Arrays.asList("password")),
                Arguments.arguments(new User.UserBuilder().username("").password("password").build(), Arrays.asList("username"))
        );
    }
}
