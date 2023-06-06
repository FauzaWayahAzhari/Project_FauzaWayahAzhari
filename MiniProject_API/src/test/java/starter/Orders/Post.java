package starter.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Post {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I am set valid POST endpoints")
    public String iAmSetValidPostEndpoints(){ return url + "orders";}
    @Step("I am send HTTP requests POST")
    public void iAmSendHttpRequestsPost(){
        String body = "{\n" +
                "      \"product_id\":14485,\n"+
                "      \"quantity\":1\n" +
                "      }";
        JSONObject requestBody = new JSONObject();

        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI";

        SerenityRest.given().auth().oauth2(AuthToken).header("Content-Type", "application/json")
                .body("[\n"+requestBody.toString()+"\n]").post(iAmSetValidPostEndpoints());
    }
    @Step("I am receive valid HTTP response code is 200")
    public void iAmReceiveValidHttpResCode200(){restAssuredThat(response -> response.statusCode(200));}
    @Step("I am set incorrect POST endpoints")
    public String iAmSetIncorrectPostEndpoint(){return url + "order";}
    @Step("I am send HTTP request POST")
    public void iAmSendHttpReqPost(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 3);
        requestBody.put("quantity", 2);
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZhdXphIFdheWFoIEF6aGFyaSIsIkVtYWlsIjoiZmF1emF3YXlhaGF6aGFyaUBnbWFpbC5jb20ifQ.QEVEMPvKuIYyGgoBdxFLxilmNqo-R271rP1U0EdQjnw";

        SerenityRest.given().auth().oauth2(AuthToken).header("Content-Type", "application/json")
                .body(requestBody.toJSONString()).post(iAmSetIncorrectPostEndpoint());
    }
    @Step("I am receive valid HTTP response code is 404")
    public void iAmReciveValidHttpResCode404(){restAssuredThat(response -> response.statusCode(404));}
}