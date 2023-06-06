package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Post {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set POST endpoint")
    public String setPostEndpoint() { return url + "products"; }
    @Step("I send POST HTTP request")
    public void sendPostHttpReq() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Sony PS5");
        requestBody.put("description", "play has no limits");
        requestBody.put("price", 299);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostEndpoint());
    }
    @Step("I receive the valid HTTP response code 200")
    public void receiveTheValidResCode() { restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I set invalid POST endpoint")
    public String setInvalidPostEndpoint() { return url + "product"; }
    @Step("I send POST HTTP requests")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Sony PS5");
        requestBody.put("description", "play has no limits");
        requestBody.put("price", 299);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setInvalidPostEndpoint());
    }
    @Step("I receive the valid HTTP response code 404")
    public void receiveResCode404() {restAssuredThat(response -> response.statusCode(404));}
    @Step("I set valid endpoint")
    public String setValidEndpoint(){return url + "products";}
    @Step("I send HTTP requested")
    public void sendHttpRequested(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Sony PS5");
        requestBody.put("description", "play has no limits");
        requestBody.put("price", "299");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setValidEndpoint());
    }
    @Step("I receive the valid HTTP response code 400")
    public void receiveResponseCode400(){restAssuredThat(response -> response.statusCode(400));}
    @Step("I set valid url")
    public String setValidUrl(){return url + "products";}
    @Step("I send HTTP request body")
    public void sendRequestBody(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "");
        requestBody.put("description", "play has no limits");
        requestBody.put("price", "299");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setValidUrl());
    }
    @Step("I receive the valid HTTP responses codes 400")
    public void receiveResponsesCodes400(){restAssuredThat(response -> response.statusCode(400));}
    @Step("I am set POST endpoint")
    public String iAmSetPostEndpoint(){return url + "products/14485/ratings";}
    @Step("I am send POST HTTP request")
    public void iAmSendHttpReq(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", "4");

        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI";

        SerenityRest.given().auth().oauth2(AuthToken).header("Content-Type", "application/json")
                .body(requestBody.toJSONString()).post(iAmSetPostEndpoint());
    }
    @Step("I am receive the valid HTTP response code 200")
    public void iAmreceiveValidHttpResCode(){ restAssuredThat(response -> response.statusCode(200));}
    @Step("I am set invalid POST endpoint")
    public String iAmSetInvalidPostEndpoint(){ return url + "product/11289/rating";}
    @Step("I am send POST HTTP requests")
    public void iAmSendPostHttpReq(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", "4");

        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZhdXphIFdheWFoIEF6aGFyaSIsIkVtYWlsIjoiZmF1emF3YXlhaGF6aGFyaUBnbWFpbC5jb20ifQ.QEVEMPvKuIYyGgoBdxFLxilmNqo-R271rP1U0EdQjnw";

        SerenityRest.given().auth().oauth2(AuthToken).header("Content-Type", "application/json")
                .body(requestBody.toJSONString()).post(iAmSetInvalidPostEndpoint());
    }
    @Step("I am receive the valid HTTP response code 404")
    public void iAmReceiveResCode404(){restAssuredThat(response -> response.statusCode(404));}
    @Step("I am set valid POST endpoint")
    public String iAmSetValidPostEndpoint(){ return url + "products/14485/comments";}
    @Step("I am sending POST HTTP request")
    public void iAmSendingPostHttpReq(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "the games are great including Gran Turismo 7 but sadly GT4 is much better");

        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI";

        SerenityRest.given().auth().oauth2(AuthToken).header("Content-Type", "application/json")
                .body(requestBody.toJSONString()).post(iAmSetValidPostEndpoint());
    }
    @Step("I am receive the valid HTTP response code is 200")
    public void iAmReceiveValidHttpResCode200(){restAssuredThat(response -> response.statusCode(200));}
    @Step("I am set invalid POST endpoints")
    public String iAmSetInvalidPostEndpoints(){return url + "product/11289/comment";}
    @Step("I am sending POST HTTP requests")
    public void iAmSendingPostHttpRequests(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "the games are great including Gran Turismo 7 but sadly GT4 is much better");

        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZhdXphIFdheWFoIEF6aGFyaSIsIkVtYWlsIjoiZmF1emF3YXlhaGF6aGFyaUBnbWFpbC5jb20ifQ.QEVEMPvKuIYyGgoBdxFLxilmNqo-R271rP1U0EdQjnw";

        SerenityRest.given().auth().oauth2(AuthToken).header("Content-Type", "application/json")
                .body(requestBody.toJSONString()).post(iAmSetInvalidPostEndpoints());
    }
    @Step("I am receive the valid HTTP response code is 404")
    public void iAmReceiveValidHttpResCode404(){restAssuredThat(response -> response.statusCode(404));}
}