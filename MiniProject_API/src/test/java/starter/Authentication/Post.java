package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Post {
    protected static String url = "https://altashop-api.fly.dev/api/auth/";
    @Step("I set valid POST endpoint")
    public String setValidPostEndpoint(){ return url + "register";}
    @Step("I send POST HTTP Req")
    public void sendPostHttpReq(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "miniprojectapiiiiiiii12@gmail.com");
        requestBody.put("password", "miniprojectapiiiiiiii12");
        requestBody.put("fullname","Mini Project Apiiiiiii Automation");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setValidPostEndpoint());
    }
    @Step("I receive correct HTTP response code is 200")
    public void receiveCorrectHttpResCode200(){restAssuredThat(response -> response.statusCode(200));}
    @Step("I set invalid POST endpoints")
    public String setInvalidPostEndpoints(){ return url + "regis";}
    @Step("I send POST HTTP Reques")
    public void sendPostHttpReques(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "test1@mail.com");
        requestBody.put("password", "test123");
        requestBody.put("full name","Test Api");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setInvalidPostEndpoints());
    }
    @Step("I receive correct HTTP response code is 404")
    public void receiveCorectHttpResponseCode(){restAssuredThat(response -> response.statusCode(404));}
    @Step("I set valid endpoints")
    public String setValidEndpoints(){return url + "register";}
    @Step("I send POST HTTP Request body")
    public void sendPostRequestBody(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "test1@mail.com");
        requestBody.put("password", "test123");
        requestBody.put("full name","Test Api");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setValidEndpoints());
    }
    @Step("I receive correct HTTP response code is 400")
    public void receiveHttpResCode400(){restAssuredThat(response -> response.statusCode(400));}
    @Step("I set valid url register")
    public String setValidUrl(){return url + "register";}
    @Step("I send POST HTTP requests body")
    public void sendRequstsBody(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "test123");
        requestBody.put("full name","Test Api");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setValidUrl());
    }
    @Step("I receive correct HTTP responses code is 400")
    public void receiveResCodeIs400(){restAssuredThat(response -> response.statusCode(400));}
    @Step("I set valids url register")
    public String setValidsUrlRegister(){ return url + "register";}
    @Step("I send POST HTTP requested body")
    public void sendPostHttpReqBody(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "apitest@gmail.com");
        requestBody.put("password", "test123");
        requestBody.put("full name","");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setValidsUrlRegister());
    }
    @Step("I receive correct HTTP responses code is 400 Bad Request")
    public void receiveResCode400(){restAssuredThat(response -> response.statusCode(400));}
    @Step("I set valids url")
    public String setValidsUrl(){return url + "register";}
    @Step("I send HTTP requested body POST")
    public void sendReqBodyPost(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "apitest@gmail.com");
        requestBody.put("password", "");
        requestBody.put("full name","api");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setValidsUrl());
    }
    @Step("I receive correct HTTP responses code 400 Bad Request")
    public void receiveCorrectResCode400(){restAssuredThat(response -> response.statusCode(400));}
    @Step("I set correct url")
    public String setCorrectUrl(){return url + "register";}
    @Step("I send HTTP requests body POST")
    public void sendHttpReq(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "");
        requestBody.put("full name","");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setCorrectUrl());
    }
    @Step("I receive correct HTTP responses codes 400 Bad Request")
    public void receiveCorrectResCode400BadReq(){restAssuredThat(response -> response.statusCode(400));}
    @Step("I set valid POST endpoints")
    public String setValidPostEndpoints(){return url + "login";}
    @Step("I send POST HTTP Reqs")
    public void sendPostHttpReqs(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "miniprojectapiiiiii12@gmail.com");
        requestBody.put("password", "miniprojectapiiiiii12");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setValidPostEndpoints());
    }
    @Step("I receive the HTTP response code is 200")
    public void receiveTheHttpResponseCode(){restAssuredThat(response -> response.statusCode(200));}
    @Step("I set invalids POST endpoint")
    public String setInvalidsPostEndpoin(){ return url + "log";}
    @Step("I sending POST HTTP Reques")
    public void sendingPostHttpReq(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "fauzawayahazhari@gmail.com");
        requestBody.put("password", "password123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setInvalidsPostEndpoin());
    }
    @Step("I receive the HTTP response code is 404")
    public void receiveTheHttpResponseCodeIs404(){restAssuredThat(response -> response.statusCode(404));}
    @Step("I set corect POST endpoint")
    public String setCorectEndpoint(){return url + "login";}
    @Step("I sending POST HTTP Request body")
    public void sendingPostHttpReqBody(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "password123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setCorectEndpoint());
    }
    @Step("I receive the HTTP response code is 400")
    public void receiveHttpResponseCode400(){restAssuredThat(response -> response.statusCode(400));}
    @Step("I set corects POST endpoint")
    public String setCorectPostEndpoint(){return url + "login";}
    @Step("I sending POST HTTP Requests body")
    public void sendingHttpReqBody(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "fauzawayahazhari@gmail.com");
        requestBody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setCorectPostEndpoint());
    }
    @Step("I receive the HTTP response code 400")
    public void receiveTheHttpResCode400(){restAssuredThat(response -> response.statusCode(400));}
    @Step("I set corects POST endpoints")
    public String setCorectsPostEndpoints(){return url + "login";}
    @Step("I sending POST HTTP Requests bodys")
    public void sendingPostHttpRequestsBodys(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setCorectsPostEndpoints());
    }
    @Step("I receive the HTTP responses code 400")
    public void receiveTheHttpResponsesCode400(){restAssuredThat(response -> response.statusCode(400));}
    @Step("I set corect POST endpoints")
    public String setCorectPostEndpoints(){return url + "login";}
    @Step("I sending HTTP Requests body POST")
    public void sendingHttpRequestsBodyPost(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "fauzawayahazhari@gmail.com");
        requestBody.put("password", "pass");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setCorectPostEndpoints());
    }
    @Step("I receive the HTTP responses codes 400")
    public void receiveTheHttpResponsesCodes400(){restAssuredThat(response -> response.statusCode(400));}
    @Step("I set corect endpoints")
    public String setCorectEndpoints(){return url + "login";}
    @Step("I sending HTTP Requests bodys POST")
    public void sendingHttpRequestsBodysPost(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "fauzaaa@gmail.com");
        requestBody.put("password", "password123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setCorectEndpoints());
    }
    @Step("I receives the HTTP responses codes 400")
    public void receivesTheHttpResponsesCodes400(){restAssuredThat(response -> response.statusCode(400));}
    @Step("I am set corect endpoints")
    public String iAmSetCorectEndpoints(){return url + "login";}
    @Step("I am sending HTTP Requests bodys POST")
    public void iAmSendingHttpReqBody(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "fauzaaa@gmail.com");
        requestBody.put("password", "pass");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iAmSetCorectEndpoints());
    }
    @Step("I am receives the HTTP responses codes 400")
    public void iAmReceivesTheHttpResCode(){restAssuredThat(response -> response.statusCode(400));}
}
