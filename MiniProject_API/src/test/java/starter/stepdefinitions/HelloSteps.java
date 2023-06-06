package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Hello.Get;

public class HelloSteps {
    @Steps
    Get get;

    @Given("I set correct GET endpoints")
    public void setCorrectGetEndpoints(){get.setCorrectGetEndpoints();}
    @When("I send HTTP requestes Get")
    public void iSendHTTPRequestesGet() {get.iSendHTTPRequestesGet();}
    @Then("I receives HTTP response codes 200")
    public void iReceivesHTTPResponseCodes() {get.iReceivesHTTPResponseCodes();}
    @Given("I set incorrect GET endpoints")
    public void iSetIncorrectGETEndpoints() {get.iSetIncorrectGETEndpoints();}
    @When("I send HTTP requested Get")
    public void iSendHTTPRequestedGet() {get.iSendHTTPRequestedGet();}
    @Then("I receives HTTP response codes 404")
    public void iReceivesHTTPResponseCodes404() {get.iReceivesHTTPResponseCodes404();}
}
