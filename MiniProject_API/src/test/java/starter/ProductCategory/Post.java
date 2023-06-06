package starter.ProductCategory;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Post {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set correct POST endpoint")
    public String setCorrectPostEndpoint(){ return url + "categories";}
    @Step("I send HTTP request POST")
    public void sendHttpReqPost(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "gaming");
        requestBody.put("description", "for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setCorrectPostEndpoint());
    }
    @Step("I receives the HTTP response code 200")
    public void receivesTheHttpResCode(){restAssuredThat(response -> response.statusCode(200));}
    @Step("I set incorrect POST endpoint")
    public String setIncorrectPostEndpoint(){ return url + "category";}
    @Step("I send HTTP requests POST")
    public void sendHttpRequestPost(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "gaming");
        requestBody.put("description", "for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setIncorrectPostEndpoint());
    }
    @Step("I receives the HTTP response code 404 Not Found")
    public void receivesTheHttpResCode404(){restAssuredThat(response -> response.statusCode(404));}
    @Step("I set correct endpoint")
    public String setCorrectEndpoint(){return url + "categories";}
    @Step("I send HTTP requests body")
    public void sendRequestsBody(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "");
        requestBody.put("description", "for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setCorrectEndpoint());
    }
    @Step("I receives the HTTP response code 500")
    public void receivesResponseCode500(){restAssuredThat(response -> response.statusCode(500));}
}
