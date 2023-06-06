package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ProductCategory.Delete;
import starter.ProductCategory.Get;
import starter.ProductCategory.Post;

public class ProductCategorySteps {
    @Steps
    Post post;
    @Steps
    Get get;
    @Steps
    Delete delete;

    @Given("I set correct POST endpoint")
    public void setCorrectPostEndpoint(){post.setCorrectPostEndpoint();}
    @When("I send HTTP request POST")
    public void sendHttpReqPost(){post.sendHttpReqPost();}
    @Then("I receives the HTTP response code 200")
    public void receivesTheHttpResCode(){post.receivesTheHttpResCode();}
    @Given("I set incorrect POST endpoint")
    public void setIncorrectPostEndpoint(){post.setIncorrectPostEndpoint();}
    @When("I send HTTP requests POST")
    public void sendHttpRequestPost(){post.sendHttpRequestPost();}
    @Then("I receives the HTTP response code 404 Not Found")
    public void receivesTheHttpResCode404(){post.receivesTheHttpResCode404();}
    @Given("I set correct endpoint")
    public void setCorrectEndpoint(){post.setCorrectEndpoint();}
    @When("I send HTTP requests body")
    public void sendRequestsBody(){post.sendRequestsBody();}
    @Then("I receives the HTTP response code 500")
    public void receivesResponseCode500(){post.receivesResponseCode500();}
    @Given("I set corrects GET endpoiint")
    public void setCorrectsGetEndpoint(){get.setCorrectsGetEndpoint();}
    @When("I sending HTTP requests Get")
    public void sendingHttpRequestGet(){get.sendingHttpRequestGet();}
    @Then("I receives HTTP response code 200 OK")
    public void receivesHttpResCode200OK(){get.receivesHttpResCode200OK();}
    @Given("I set incorrects GET endpoint")
    public void iSetIncorrectsGETEndpoint() {get.iSetIncorrectsGETEndpoint();}
    @When("I send HTTP req Get")
    public void iSendHTTPReqGet() {get.iSendHTTPReqGet();}
    @Then("I receives HTTP ResCode 404")
    public void iReceivesHTTPResCode() {get.iReceivesHTTPResCode();}
    @Given("I set correct GET endpoint")
    public void setCorrectGetEndpoint(){get.setCorrectGetEndpoint();}
    @When("I send HTTP request Get")
    public void iSendHTTPRequestGet() {get.iSendHTTPRequestGet();}
    @Then("I receives HTTP response code 200")
    public void iReceivesHTTPResponseCode() {get.iReceivesHTTPResponseCode();}
    @Given("I set incorrect GET endpoint")
    public void iSetIncorrectGETEndpoint() {get.iSetIncorrectGETEndpoint();}
    @When("I send HTTP requests Get")
    public void iSendHTTPRequestsGet() {get.iSendHTTPRequestsGet();}
    @Then("I receives HTTP response code 404")
    public void iReceivesHTTPResponseCode404() {get.iReceivesHTTPResponseCode404();}
    @Given("I set Delete endpointss")
    public void iSetDeleteEndpointss() {delete.iSetDeleteEndpointss();}
    @When("I send HTTP request Delete")
    public void iSendHTTPRequestDelete() {delete.iSendHTTPRequestDelete();}
    @Then("I receive valid HTTP responses code 200")
    public void iReceiveValidHTTPResponsesCode() {delete.iReceiveValidHTTPResponsesCode();}
    @Given("I set invalid Delete endpoints")
    public void iSetInvalidDeleteEndpoints() {delete.iSetInvalidDeleteEndpoints();}
    @When("I send HTTP requests Delete")
    public void iSendHTTPRequestsDelete() {delete.iSendHTTPRequestsDelete();}
    @Then("I receive HTTP responses codes 404")
    public void iReceiveHTTPResponsesCodes() {delete.iReceiveHTTPResponsesCodes();}
}
