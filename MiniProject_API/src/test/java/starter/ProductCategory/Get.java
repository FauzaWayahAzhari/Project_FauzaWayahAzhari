package starter.ProductCategory;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set correct GET endpoint")
    public String setCorrectGetEndpoint(){return url + "categories";}
    @Step("I send HTTP request Get")
    public void iSendHTTPRequestGet() {
        SerenityRest.given()
                .when()
                .get(setCorrectGetEndpoint());
    }
    @Step("I receives HTTP response code 200")
    public void iReceivesHTTPResponseCode() {restAssuredThat(response -> response.statusCode(200));}
    @Step("I set incorrect GET endpoint")
    public String iSetIncorrectGETEndpoint() {return url + "category";}
    @Step("I send HTTP requests Get")
    public void iSendHTTPRequestsGet() {
        SerenityRest.given()
                .when()
                .get(iSetIncorrectGETEndpoint());
    }
    @Step("I receives HTTP response code 404")
    public void iReceivesHTTPResponseCode404() {restAssuredThat(response -> response.statusCode(404));}
    @Step("I set corrects GET endpoiint")
    public String setCorrectsGetEndpoint(){ return url + "categories/13273";}
    @Step("I sending HTTP requests Get")
    public void sendingHttpRequestGet(){
        SerenityRest.given()
                .when()
                .get(setCorrectsGetEndpoint());
    }
    @Step("I receives HTTP response code 200 OK")
    public void receivesHttpResCode200OK(){restAssuredThat(response -> response.statusCode(200));}
    @Step("I set incorrects GET endpoint")
    public String iSetIncorrectsGETEndpoint() {return url + "category/11296";}
    @Step("I send HTTP req Get")
    public void iSendHTTPReqGet() {
        SerenityRest.given()
                .when()
                .get(iSetIncorrectsGETEndpoint());
    }
    @Step("I receives HTTP ResCode 404")
    public void iReceivesHTTPResCode() {
        restAssuredThat(response -> response.statusCode(404));}
}