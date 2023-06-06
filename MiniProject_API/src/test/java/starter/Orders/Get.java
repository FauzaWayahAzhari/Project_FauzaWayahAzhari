package starter.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I am set valid Get endpoints")
    public String iAmSetValidGetEndpoints(){ return url + "orders";}
    @Step("I am send HTTP requests Get")
    public void iAmSendHttpReqGet(){
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw";

        SerenityRest.given().auth().oauth2(AuthToken)
                .when()
                .get(iAmSetValidGetEndpoints());}
    @Step("I am receive HTTP response code is 200")
    public void iAmReceiveHttpResCodeIs200(){restAssuredThat(response -> response.statusCode(200));}
    @Step("I am set invalid Get endpoints")
    public String iAmSetInvalidGetEndpoints() {return url + "order";}
    @Step("I am sending HTTP requests Get")
    public void iAmSendingHTTPRequestsGet() {
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw";

        SerenityRest.given().auth().oauth2(AuthToken)
                .when()
                .get(iAmSetInvalidGetEndpoints());}
    @Step("I am receive HTTP response code is 404")
    public void iAmReceiveHTTPResponseCodeIs() {restAssuredThat(response -> response.statusCode(404));}
    @Step("I am set correct Get endpoints")
    public String iAmSetCorrectGetEndpoints() {return url + "orders/10938";}
    @Step("I am send HTTP request Get")
    public void iAmSendHTTPRequestGet() {
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI";

        SerenityRest.given().auth().oauth2(AuthToken)
                .when()
                .get(iAmSetCorrectGetEndpoints());
    }
    @Step("I am receive HTTP responses code is 200")
    public void iAmReceiveHTTPResponsesCodeIs() {restAssuredThat(response -> response.statusCode(200));}
    @Step("I am set incorrect Get endpoints")
    public String iAmSetIncorrectGetEndpoints() {return url + "order/7316";}
    @Step("I am sending HTTP request Get")
    public void iAmSendingHTTPRequestGet() {
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw";

        SerenityRest.given().auth().oauth2(AuthToken)
                .when()
                .get(iAmSetIncorrectGetEndpoints());
    }
    @Step("I am receive HTTP responses code is 404")
    public void iAmReceiveHTTPResponsesCodeIs404() {restAssuredThat(response -> response.statusCode(404));}
}