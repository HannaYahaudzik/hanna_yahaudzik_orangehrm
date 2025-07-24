package eu.senla.utilities.api;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;

public final class RequestManager {

    private RequestManager() {

    }

    public static Response getRequest(final RequestSpecification requestSpecification,
                                      final ResponseSpecification responseSpecification,
                                      final String path) {
        return given()
                .spec(requestSpecification)
                .basePath(path)
                .when()
                .get();
//                .then()
//                .log().ifError()
//                .spec(responseSpecification);

    }

    public static Response getRequest(final String path) {
        return getRequest(SpecConfig.requestSpecification(), SpecConfig.responseSpecification(), path);
    }
}
