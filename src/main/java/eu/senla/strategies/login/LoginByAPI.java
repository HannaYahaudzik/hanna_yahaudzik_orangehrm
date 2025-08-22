package eu.senla.strategies.login;

import eu.senla.driver.Driver;
import eu.senla.pages.LoginPage;
import eu.senla.pages.auth.BaseAuthPage;
import eu.senla.pages.auth.DashboardPage;
import eu.senla.utilities.ReadPropertyFile;
import eu.senla.utilities.api.RequestManager;
import eu.senla.utilities.api.SpecConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.jsoup.Jsoup;
import org.openqa.selenium.Cookie;

public class LoginByAPI implements LoginStrategy {

    @Override
    public final BaseAuthPage login() {

        new LoginPage();
//        new DashboardPage();

        Response response = RequestManager.getRequest("/web/index.php/auth/login");

        RequestSpecification requestSpecification = SpecConfig.requestSpecification()
                .contentType(ContentType.URLENC.withCharset("UTF-8"))
                .formParam("_token", Jsoup.parse(response.getBody().asString()).select("auth-login").attr(":token"))
                .formParam("username", ReadPropertyFile.getProperties("USERNAME"))
                .formParam("password", ReadPropertyFile.getProperties("PASSWORD"));

        response = RequestManager.postRequest(requestSpecification, "/web/index.php/auth/validate",
                response.getDetailedCookie("orangehrm"));

        Cookie cookie = new Cookie.Builder("orangehrm", response.getCookie("orangehrm"))
                .domain("opensource-demo.orangehrmlive.com")
                .path("/web")
                .isSecure(true)
                .isHttpOnly(true)
                .sameSite("Lax")
                .build();

        Driver.getInstance().manage().deleteCookieNamed("orangehrm");
        Driver.getInstance().manage().addCookie(cookie);
        return new DashboardPage();

    }
}
