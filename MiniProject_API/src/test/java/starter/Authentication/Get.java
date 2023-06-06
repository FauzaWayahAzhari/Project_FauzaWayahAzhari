package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get {
    protected static String url = "https://altashop-api.fly.dev/api/auth/";
    @Step("I am set valid GET endpoint")
    public String iAmSetValidGetEndpoint(){ return url + "info";}
    @Step("I am send GET HTTP Request")
    public void iAmSendGETHttpRequest() {
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IlRlc2EiLCJFbWFpbCI6InRlc2FAbWFpbC5jb20ifQ.Kvr3NCVeBOoX-LTmQEWkycdKV5pUNShftxfnEctx06w";

        SerenityRest.given().auth().oauth2(AuthToken)
                .when()
                .get(iAmSetValidGetEndpoint());
    }
    @Step("I am receive correct HTTP response code 200")
    public void iAmReceiveCorrectHttpResponseCode() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I am set invalid GET endpoint")
    public String iAmSetInvalidGetEndoint(){ return url + "inpo";}
    @Step("I am send GET HTTP Requests")
    public void iAmSendGetHttpRequests(){
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZhdXphIFdheWFoIEF6aGFyaSIsIkVtYWlsIjoiZmF1emF3YXlhaGF6aGFyaUBnbWFpbC5jb20ifQ.QEVEMPvKuIYyGgoBdxFLxilmNqo-R271rP1U0EdQjnw";

        SerenityRest.given().auth().oauth2(AuthToken)
                .when()
                .get(iAmSetInvalidGetEndoint());
    }
    @Step("I am receive correct HTTP response code 404")
    public void iAmReceiveCorrectHttpResponseCode404(){restAssuredThat(response -> response.statusCode(404));}
}
