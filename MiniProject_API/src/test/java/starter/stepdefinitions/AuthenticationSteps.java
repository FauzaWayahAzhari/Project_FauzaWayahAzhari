package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Authentication.Get;
import starter.Authentication.Post;

public class AuthenticationSteps {
    @Steps
    Get get;
    @Steps
    Post post;

    @Given("I set valid POST endpoint")
    public void setValidPostEndpoint(){post.setValidPostEndpoint();}
    @When("I send POST HTTP Req")
    public void sendPostHttpReq(){post.sendPostHttpReq();}
    @Then("I receive correct HTTP response code is 200")
    public void receiveCorrectHttpResCode200(){post.receiveCorrectHttpResCode200();}
    @Given("I set invalid POST endpoints")
    public void setInvalidPostEndpoints(){post.setInvalidPostEndpoints();}
    @When("I send POST HTTP Reques")
    public void sendPostHttpReques(){post.sendPostHttpReques();}
    @Then("I receive correct HTTP response code is 404")
    public void receiveCorectHttpResponseCode(){post.receiveCorectHttpResponseCode();}
    @Given("I set valid endpoints")
    public void setValidEndpoints(){post.setValidEndpoints();}
    @When("I send POST HTTP Request body")
    public void sendPostRequestBody(){post.sendPostRequestBody();}
    @Then("I receive correct HTTP response code is 400")
    public void receiveHttpResCode400(){post.receiveHttpResCode400();}
    @Given("I set valid url register")
    public void setValidUrl(){post.setValidUrl();}
    @When("I send POST HTTP requests body")
    public void sendRequstsBody(){post.sendRequstsBody();}
    @Then("I receive correct HTTP responses code is 400")
    public void receiveResCodeIs400(){post.receiveResCodeIs400();}
    @Given("I set valids url register")
    public void setValidsUrlRegister(){post.setValidsUrlRegister();}
    @When("I send POST HTTP requested body")
    public void sendPostHttpReqBody(){post.sendPostHttpReqBody();}
    @Then("I receive correct HTTP responses code is 400 Bad Request")
    public void receiveResCode400(){post.receiveResCode400();}
    @Given("I set valids url")
    public void setValidsUrl(){post.setValidsUrl();}
    @When("I send HTTP requested body POST")
    public void sendReqBodyPost(){post.sendReqBodyPost();}
    @Then("I receive correct HTTP responses code 400 Bad Request")
    public void receiveCorrectResCode400(){post.receiveCorrectResCode400();}
    @Given("I set correct url")
    public void setCorrectUrl(){post.setCorrectUrl();}
    @When("I send HTTP requests body POST")
    public void sendHttpReq(){post.sendHttpReq();}
    @Then("I receive correct HTTP responses codes 400 Bad Request")
    public void receiveCorrectResCode400BadReq(){post.receiveCorrectResCode400BadReq();}
    @Given("I set valid POST endpoints")
    public void setValidPostEndpoints(){post.setValidPostEndpoints();}
    @When("I send POST HTTP Reqs")
    public void sendPostHttpReqs(){post.sendPostHttpReqs();}
    @Then("I receive the HTTP response code is 200")
    public void receiveTheHttpResponseCode(){post.receiveTheHttpResponseCode();}
    @Given("I set invalids POST endpoint")
    public void setInvalidsPostEndpoin(){post.setInvalidsPostEndpoin();}
    @When("I sending POST HTTP Reques")
    public void sendingPostHttpReq(){post.sendingPostHttpReq();}
    @Then("I receive the HTTP response code is 404")
    public void receiveTheHttpResponseCodeIs404(){post.receiveTheHttpResponseCodeIs404();}
    @Given("I set corect POST endpoint")
    public void setCorectEndpoint(){post.setCorectEndpoint();}
    @When("I sending POST HTTP Request body")
    public void sendingPostHttpReqBody(){post.sendingPostHttpReqBody();}
    @Then("I receive the HTTP response code is 400")
    public void receiveHttpResponseCode400(){post.receiveHttpResponseCode400();}
    @Given("I set corects POST endpoint")
    public void setCorectPostEndpoint(){post.setCorectPostEndpoint();}
    @When("I sending POST HTTP Requests body")
    public void sendingHttpReqBody(){post.sendingHttpReqBody();}
    @Then("I receive the HTTP response code 400")
    public void receiveTheHttpResCode400(){post.receiveTheHttpResCode400();}
    @Given("I set corects POST endpoints")
    public void setCorectsPostEndpoints(){post.setCorectsPostEndpoints();}
    @When("I sending POST HTTP Requests bodys")
    public void sendingPostHttpRequestsBodys(){post.sendingPostHttpRequestsBodys();}
    @Then("I receive the HTTP responses code 400")
    public void receiveTheHttpResponsesCode400(){post.receiveTheHttpResponsesCode400();}
    @Given("I set corect POST endpoints")
    public void setCorectPostEndpoints(){post.setCorectPostEndpoints();}
    @When("I sending HTTP Requests body POST")
    public void sendingHttpRequestsBodyPost(){post.sendingHttpRequestsBodyPost();}
    @Then("I receive the HTTP responses codes 400")
    public void receiveTheHttpResponsesCodes400(){post.receiveTheHttpResponsesCodes400();}
    @Given("I set corect endpoints")
    public void setCorectEndpoints(){post.setCorectEndpoints();}
    @When("I sending HTTP Requests bodys POST")
    public void sendingHttpRequestsBodysPost(){post.sendingHttpRequestsBodysPost();}
    @Then("I receives the HTTP responses codes 400")
    public void receivesTheHttpResponsesCodes400(){post.receivesTheHttpResponsesCodes400();}
    @Given("I am set corect endpoints")
    public void iAmSetCorectEndpoints(){post.iAmSetCorectEndpoints();}
    @When("I am sending HTTP Requests bodys POST")
    public void iAmSendingHttpReqBody(){post.iAmSendingHttpReqBody();}
    @Then("I am receives the HTTP responses codes 400")
    public void iAmReceivesTheHttpResCode(){post.iAmReceivesTheHttpResCode();}
    @Given("I am set valid GET endpoint")
    public void iAmSetValidGetEndpoint() {get.iAmSetValidGetEndpoint();}
    @When("I am send GET HTTP Request")
    public void iAmSendGetHttpRequest() {get.iAmSendGETHttpRequest();}
    @Then("I am receive correct HTTP response code 200")
    public void iAmReceiveCorrectHttpResponseCode() {get.iAmReceiveCorrectHttpResponseCode();}
    @Given("I am set invalid GET endpoint")
    public void iAmSetInvalidGetEndoint(){get.iAmSetInvalidGetEndoint();}
    @When("I am send GET HTTP Requests")
    public void iAmSendGetHttpRequests(){get.iAmSendGetHttpRequests();}
    @Then("I am receive correct HTTP response code 404")
    public void iAmReceiveCorrectHttpResponseCode404(){get.iAmReceiveCorrectHttpResponseCode404();}
}
