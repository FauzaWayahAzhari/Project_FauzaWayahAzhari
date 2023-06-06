package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Products.Delete;
import starter.Products.Get;
import starter.Products.Post;

public class ProductsSteps {
    @Steps
    Get get;
    @Steps
    Post post;
    @Steps
    Delete delete;

    @Given("I set GET endpoint")
    public void setGetEndpoint(){get.setGetEndpoint();}
    @When("I send GET HTTP request")
    public void sendGetHttpRequest(){get.sendGetHttpRequest();}
    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode(){get.receiveValidHttpResponseCode();}
    @Given("I set invalid GET endpoint")
    public void iSetInvalidGETEndpoint() { get.iSetInvalidGETEndpoint();}
    @When("I send GET HTTP requests")
    public void iSendGETHTTPRequests() { get.iSendGETHTTPRequests();}
    @Then("I receive valid HTTP response code 404")
    public void iReceiveValidHTTPResponseCode() {get.iReceiveValidHTTPResponseCode();}
    @Given("I set POST endpoint")
    public void setPostEndpoint(){post.setPostEndpoint();}
    @When("I send POST HTTP request")
    public void sendPostHttpReq(){post.sendPostHttpReq();}
    @Then("I receive the valid HTTP response code 200")
    public void receiveTheValidResCode(){post.receiveTheValidResCode();}
    @Given("I set invalid POST endpoint")
    public void setInvalidPostEndpoint(){post.setInvalidPostEndpoint();}
    @When("I send POST HTTP requests")
    public void sendPostHttpRequest(){post.sendPostHttpRequest();}
    @Then("I receive the valid HTTP response code 404")
    public void receiveResCode404(){post.receiveResCode404();}
    @Given("I set valid endpoint")
    public void setValidEndpoint(){post.setValidEndpoint();}
    @When("I send HTTP requested")
    public void sendHttpRequested(){post.sendHttpRequested();}
    @Then("I receive the valid HTTP response code 400")
    public void receiveResponseCode400(){post.receiveResponseCode400();}
    @Given("I set valid url")
    public void setValidUrl(){post.setValidUrl();}
    @When("I send HTTP request body")
    public void sendRequestBody(){post.sendRequestBody();}
    @Then("I receive the valid HTTP responses codes 400")
    public void receiveResponsesCodes400(){post.receiveResponsesCodes400();}
    @Given("I set valids GET endpoints")
    public void setValidsGetEndpoints(){get.setValidsGetEndpoints();}
    @When("I send HTTP request")
    public void sendHttpRequest(){get.sendHttpRequest();}
    @Then("I receive the valid HTTP responses code 200")
    public void receiveTheValidHttpResponsesCode(){get.receiveTheValidHttpResponsesCode();}
    @Given("I set invaliid GET endpoints")
    public void setInvaliidGetEndpoints(){get.setInvaliidGetEndpoints();}
    @When("I send HTTP requests")
    public void sendHttpRequests(){get.sendHttpRequests();}
    @Then("I receive the valid HTTP responses code 404")
    public void receiveTheValidHttpResponseCode(){get.receiveTheValidHttpResponseCode();}
    @Given("I set Delete endpoint")
    public void iSetDeleteEndpoint() {delete.iSetDeleteEndpoint();}
    @When("I send Delete HTTP request")
    public void iSendDeleteHTTPRequest() {delete.iSendDeleteHTTPRequest();}
    @Then("I receive HTTP responses code 200")
    public void iReceiveHTTPResponsesCode() {delete.iReceiveHTTPResponsesCode();}
    @Given("I set invalid Delete endpoint")
    public void iSetInvalidDeleteEndpoint() {delete.iSetInvalidDeleteEndpoint();}
    @When("I send Delete HTTP requests")
    public void iSendDeleteHTTPRequests() {delete.iSendDeleteHTTPRequests();}
    @Then("I receive HTTP responses code 404")
    public void iReceiveHTTPResponsesCode404() {delete.iReceiveHTTPResponsesCode404();}
    @Given("I am set POST endpoint")
    public void iAmSetPostEndpoint(){post.iAmSetPostEndpoint();}
    @When("I am send POST HTTP request")
    public void iAmSendHttpReq(){post.iAmSendHttpReq();}
    @Then("I am receive the valid HTTP response code 200")
    public void iAmreceiveValidHttpResCode(){post.iAmreceiveValidHttpResCode();}
    @Given("I am set invalid POST endpoint")
    public void iAmSetInvalidPostEndpoint(){post.iAmSetInvalidPostEndpoint();}
    @When("I am send POST HTTP requests")
    public void iAmSendPostHttpReq(){post.iAmSendPostHttpReq();}
    @Then("I am receive the valid HTTP response code 404")
    public void iAmReceiveResCode404(){post.iAmReceiveResCode404();}
    @Given("I set valid GET endpoint")
    public void iSetValidGETEndpoint() {get.iSetValidGETEndpoint();}
    @When("I send GET HTTP requestt")
    public void iSendGETHTTPRequestt() {get.iSendGETHTTPRequestt();}
    @Then("I receive HTTP response code 200")
    public void iReceiveHTTPResponseCode() {get.iReceiveHTTPResponseCode();}
    @Given("I set invalids GET endpoint")
    public void iSetInvalidsGETEndpoint() {get.iSetInvalidsGETEndpoint();}
    @When("I send GET HTTP requestts")
    public void iSendGETHTTPRequestts() {get.iSendGETHTTPRequestts();}
    @Then("I receive HTTP response code 404")
    public void iReceiveHTTPResponseCode404() {get.iReceiveHTTPResponseCode404();}
    @Given("I am set valid POST endpoint")
    public void iAmSetValidPostEndpoint(){post.iAmSetValidPostEndpoint();}
    @When("I am sending POST HTTP request")
    public void iAmSendingPostHttpReq(){post.iAmSendingPostHttpReq();}
    @Then("I am receive the valid HTTP response code is 200")
    public void iAmReceiveValidHttpResCode200(){post.iAmReceiveValidHttpResCode200();}
    @Given("I am set invalid POST endpoints")
    public void iAmSetInvalidPostEndpoints(){post.iAmSetInvalidPostEndpoints();}
    @When("I am sending POST HTTP requests")
    public void iAmSendingPostHttpRequests(){post.iAmSendingPostHttpRequests();}
    @Then("I am receive the valid HTTP response code is 404")
    public void iAmReceiveValidHttpResCode404(){post.iAmReceiveValidHttpResCode404();}
    @Given("I set valids GET endpoint")
    public void iSetValidsGETEndpoint() {get.iSetValidsGETEndpoint();}
    @When("I send GET HTTP requestted")
    public void iSendGETHTTPRequestted() {get.iSendGETHTTPRequestted();}
    @Then("I receive HTTP response codes 200")
    public void iReceiveHTTPResponseCodes() {get.iReceiveHTTPResponseCodes();}
    @Given("I set invalids GET endpoints")
    public void iSetInvalidsGETEndpoints() {get.iSetInvalidsGETEndpoints();}
    @When("I send GET HTTP requestss")
    public void iSendGETHTTPRequestss() {get.iSendGETHTTPRequestss();}
    @Then("I receive HTTP response codes 404")
    public void iReceiveHTTPResponseCodes404() {get.iReceiveHTTPResponseCodes404();}
    @Given("I set corrects GET endpoints")
    public void iSetCorrectsGETEndpoints() {get.iSetCorrectsGETEndpoints();}
    @When("I send GET HTTP req")
    public void iSendGETHTTPReq() {get.iSendGETHTTPReq();}
    @Then("I receive HTTP res codes 404")
    public void iReceiveHTTPResCodes() {get.iReceiveHTTPResCodes();}
}
