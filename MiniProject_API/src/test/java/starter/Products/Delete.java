package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set Delete endpoint")
    public String iSetDeleteEndpoint() {return url + "products/1";}
    @Step("I send Delete HTTP request")
    public void iSendDeleteHTTPRequest() { SerenityRest.given().delete(iSetDeleteEndpoint());}
    @Step("I receive HTTP responses code 200")
    public void iReceiveHTTPResponsesCode() {restAssuredThat(response -> response.statusCode(200));}
    @Step("I set invalid Delete endpoint")
    public String iSetInvalidDeleteEndpoint() {return url + "product/1";}
    @Step("I send Delete HTTP requests")
    public void iSendDeleteHTTPRequests() {SerenityRest.given().delete(iSetInvalidDeleteEndpoint());}
    @Step("I receive HTTP responses code 404")
    public void iReceiveHTTPResponsesCode404() {restAssuredThat(response -> response.statusCode(404));}
}
