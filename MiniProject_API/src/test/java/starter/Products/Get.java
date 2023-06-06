package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.CoreMatchers;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET endpoint")
    public String setGetEndpoint(){ return url +"products";}
    @Step("I send GET HTTP request")
    public void sendGetHttpRequest(){
        SerenityRest.given()
                .when()
                .get(setGetEndpoint());
    }
    @Step("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode(){restAssuredThat(response -> response.statusCode(200));}
    @Step("I set invalid GET endpoint")
    public String iSetInvalidGETEndpoint() { return url + "product";}
    @Step("I send GET HTTP requests")
    public void iSendGETHTTPRequests() {
        SerenityRest.given()
                .when()
                .get(iSetInvalidGETEndpoint());
    }
    @Step("I receive valid HTTP response code 404")
    public void iReceiveValidHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("I set valid GET endpoint")
    public String iSetValidGETEndpoint() {return url + "products/1/ratings";}
    @Step("I send GET HTTP requestt")
    public void iSendGETHTTPRequestt() {
        SerenityRest.given()
                .when()
                .get(iSetValidGETEndpoint());
    }
    @Step("I receive HTTP response code 200")
    public void iReceiveHTTPResponseCode() {restAssuredThat(response -> response.statusCode(200));}
    @Step("I set valids GET endpoints")
    public String setValidsGetEndpoints(){ return url + "products/14483";}
    @Step("I send HTTP request")
    public void sendHttpRequest(){
        SerenityRest.given()
                .when()
                .get(setValidsGetEndpoints());
    }
    @Step("I receive the valid HTTP responses code 200")
    public void receiveTheValidHttpResponsesCode(){restAssuredThat(response -> response.statusCode(200));}
    @Step("I set invaliid GET endpoints")
    public String setInvaliidGetEndpoints(){ return url + "product/11672";}
    @Step("I send HTTP requests")
    public void sendHttpRequests(){
        SerenityRest.given()
                .when()
                .get(setInvaliidGetEndpoints());
    }
    @Step("I receive the valid HTTP responses code 404")
    public void receiveTheValidHttpResponseCode(){restAssuredThat(response -> response.statusCode(404));}
    @Step("I set invalids GET endpoint")
    public String iSetInvalidsGETEndpoint() {return url + "product/1/rating";}
    @Step("I send GET HTTP requestts")
    public void iSendGETHTTPRequestts() {
        SerenityRest.given()
                .when()
                .get(iSetInvalidsGETEndpoint());
    }
    @Step("I receive HTTP response code 404")
    public void iReceiveHTTPResponseCode404() {restAssuredThat(response -> response.statusCode(404));}
    @Step("I set valids GET endpoint")
    public String iSetValidsGETEndpoint() {return url + "products/2/comments";}
    @Step("I send GET HTTP requestted")
    public void iSendGETHTTPRequestted() {
        SerenityRest.given()
                .when()
                .get(iSetValidsGETEndpoint());
    }
    @Step("I receive HTTP response codes 200")
    public void iReceiveHTTPResponseCodes() {restAssuredThat(response -> response.statusCode(200));}
    @Step("I set invalids GET endpoints")
    public String iSetInvalidsGETEndpoints() {return url + "product/2/comment";}
    @Step("I send GET HTTP requestss")
    public void iSendGETHTTPRequestss() {
        SerenityRest.given()
                .when()
                .get(iSetInvalidsGETEndpoints());
    }
    @Step("I receive HTTP response codes 404")
    public void iReceiveHTTPResponseCodes404() {restAssuredThat(response -> response.statusCode(404));}
    @Step("I set corrects GET endpoints")
    public String iSetCorrectsGETEndpoints() {return url + "products/1";}
    @Step("I send GET HTTP req")
    public void iSendGETHTTPReq() {
        SerenityRest.given()
                .when()
                .get(iSetCorrectsGETEndpoints());
    }
    @Step("I receive HTTP res codes 404")
    public void iReceiveHTTPResCodes() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
