package api;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.io.File;
import java.util.HashMap;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.equalTo;


public class APITestHW10 extends BaseApiTest{
    String API_key = "2c29b8b0ade45979970aaddf0f261b14";
    private Map<String, Object> reqBody = new HashMap<>();

    @BeforeMethod
    public void setReqBody() {

        Map<String, Object> methodProperties = new HashMap<>();

        methodProperties.put("Limit", 10);

        reqBody.put("apiKey", API_key);
        reqBody.put("modelName", "Address");
        reqBody.put("calledMethod", "getSettlements");
        reqBody.put("methodProperties", methodProperties);
    }

    @Test
    public void checkThatSuccessDovidnikOfPopulationPointsOfUkraine() {

        given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body("success", equalTo(true));
    }

    @Test
    public void checkJsonSchemaDovidnikOfPopulationPointsOfUkraine() {

        given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body(matchesJsonSchema(new File(System.
                        getProperty("user.dir") + "/src/main/resources/validators/np_populationPoints_schema.json")));
    }

    @Test
    public void checkRegionsDovidnikOfPopulationPointsOfUkraineOneParam() {

        given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body("success", equalTo(true))
                .body("data[0].SettlementTypeDescription", equalTo("село"));
    }

    @Test
    public void checkAbrazivkaIsDescriptionWithPojoUsage1() {

        PopulationPointsHW10 populationPointsHW10 =
                given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .extract()
                .body().jsonPath().getObject("data[0]", PopulationPointsHW10.class);


        System.out.println(populationPointsHW10);
        Assert.assertTrue(populationPointsHW10.getDescription().contains("Абазівка"));
    }
    @Test
    public void checkAbrazivkaIsDescriptionWithPojoUsage2() {

        PopulationPointsHW10 populationPointsHW10 = given()
                .spec(this.requestSpecification)
                .when()
                .contentType(ContentType.JSON).when().body(this.reqBody)
                .post()
                .then().log().all()
                .extract()
                .body().jsonPath().getObject("data[0]", PopulationPointsHW10.class);


        System.out.println(populationPointsHW10);
        Assert.assertTrue(populationPointsHW10.getDescription().contains("Абазівка"));
    }
}
