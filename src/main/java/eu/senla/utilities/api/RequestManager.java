package eu.senla.utilities.api;

import io.restassured.http.Cookie;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public final class RequestManager {

    private RequestManager() {

    }

    public static Response getRequest(final RequestSpecification requestSpecification,
                                      final String path) {
        return given()
                .spec(requestSpecification)
                .basePath(path)
                .when()
                .get();

    }

    public static Response getRequest(final String path) {
        return getRequest(SpecConfig.requestSpecification(), path);
    }

    private static Headers headRequest(final String path) {

        return given(SpecConfig.requestSpecification())
                .head(path)
                .getHeaders();
    }


    public static Response postRequest(final RequestSpecification requestSpecification,
                                       final String path,
                                       final Cookie cookie) {
        return given()
                .headers(headRequest(path))
                .spec(requestSpecification)
                .cookie(cookie)
                .basePath(path)
                .when()
                .post();

    }
}
