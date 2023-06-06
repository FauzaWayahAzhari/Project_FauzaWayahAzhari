package starter.Hello;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set correct GET endpoints")
    public String setCorrectGetEndpoints(){ return url + "hello";}
    @Step("I send HTTP requestes Get")
    public void iSendHTTPRequestesGet() {
        SerenityRest.given()
                .when()
                .get(setCorrectGetEndpoints());
    }
    @Step("I receives HTTP response codes 200")
    public void iReceivesHTTPResponseCodes() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I set incorrect GET endpoints")
    public String iSetIncorrectGETEndpoints() { return url + "helo";}
    @Step("I send HTTP requested Get")
    public void iSendHTTPRequestedGet() {
        SerenityRest.given()
                .when()
                .get(iSetIncorrectGETEndpoints());
    }
    @Step("I receives HTTP response codes 404")
    public void iReceivesHTTPResponseCodes404() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
