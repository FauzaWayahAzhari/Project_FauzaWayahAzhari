package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Orders.Get;
import starter.Orders.Post;

public class OrdersSteps {
    @Steps
    Post post;
    @Steps
    Get get;

    @Given("I am set valid POST endpoints")
    public void iAmSetValidPostEndpoints(){post.iAmSetValidPostEndpoints();}
    @When("I am send HTTP requests POST")
    public void iAmSendHttpRequestsPost(){post.iAmSendHttpRequestsPost();}
    @Then("I am receive valid HTTP response code is 200")
    public void iAmReceiveValidHttpResCode200(){post.iAmReceiveValidHttpResCode200();}
    @Given("I am set incorrect POST endpoints")
    public void iAmSetIncorrectPostEndpoint(){post.iAmSetIncorrectPostEndpoint();}
    @When("I am send HTTP request POST")
    public void iAmSendHttpReqPost(){post.iAmSendHttpReqPost();}
    @Then("I am receive valid HTTP response code is 404")
    public void iAmReciveValidHttpResCode404(){post.iAmReciveValidHttpResCode404();}
    @Given("I am set valid Get endpoints")
    public void iAmSetValidGetEndpoints(){get.iAmSetValidGetEndpoints();}
    @When("I am send HTTP requests Get")
    public void iAmSendHttpReqGet(){get.iAmSendHttpReqGet();}
    @Then("I am receive HTTP response code is 200")
    public void iAmReceiveHttpResCodeIs200(){get.iAmReceiveHttpResCodeIs200();}
    @Given("I am set invalid Get endpoints")
    public void iAmSetInvalidGetEndpoints() {get.iAmSetInvalidGetEndpoints();}
    @When("I am sending HTTP requests Get")
    public void iAmSendingHTTPRequestsGet() {get.iAmSendingHTTPRequestsGet();}
    @Then("I am receive HTTP response code is 404")
    public void iAmReceiveHTTPResponseCodeIs() {get.iAmReceiveHTTPResponseCodeIs();}
    @Given("I am set correct Get endpoints")
    public void iAmSetCorrectGetEndpoints() {get.iAmSetCorrectGetEndpoints();}
    @When("I am send HTTP request Get")
    public void iAmSendHTTPRequestGet() {get.iAmSendHTTPRequestGet();}
    @Then("I am receive HTTP responses code is 200")
    public void iAmReceiveHTTPResponsesCodeIs() {get.iAmReceiveHTTPResponsesCodeIs();}
    @Given("I am set incorrect Get endpoints")
    public void iAmSetIncorrectGetEndpoints() {get.iAmSetIncorrectGetEndpoints();}
    @When("I am sending HTTP request Get")
    public void iAmSendingHTTPRequestGet() {get.iAmSendingHTTPRequestGet();}
    @Then("I am receive HTTP responses code is 404")
    public void iAmReceiveHTTPResponsesCodeIs404() {get.iAmReceiveHTTPResponsesCodeIs404();}
}