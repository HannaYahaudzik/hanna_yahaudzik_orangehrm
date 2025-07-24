package eu.senla.strategy.login;

import eu.senla.pageObject.auth.BaseAuthPage;
import eu.senla.utilities.api.RequestManager;
import io.restassured.response.Response;
import org.jsoup.Jsoup;

public class LoginByAPI implements LoginStrategy{
    @Override
    public BaseAuthPage login() {

        Response response = RequestManager.getRequest("/web/index.php/auth/login");
        String cookie = response.getCookie("orangehrm");
        String token = Jsoup.parse(response.getBody().asString()).select("auth-login").attr(":token");



        return null;
    }
}
