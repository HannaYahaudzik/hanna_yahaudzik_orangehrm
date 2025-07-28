package eu.senla.utilities.api;

import eu.senla.utilities.ReadPropertyFile;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public final class SpecConfig {

    private static final int STATUS_CODE_SUCCESS = 200;

    private SpecConfig() {
    }

    public static RequestSpecification requestSpecification() {
        return new RequestSpecBuilder()
                .setBaseUri(ReadPropertyFile.getProperties("BASE_URL"))
                .build();
    }

    public static ResponseSpecification responseSpecification() {
        return new ResponseSpecBuilder()
                .expectStatusCode(STATUS_CODE_SUCCESS)
                .build();
    }
}
