package starter.ProductCategory;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    protected static String url =  "https://altashop-api.fly.dev/api/";
    @Step("I set Delete endpointss")
    public String iSetDeleteEndpointss() {return url + "categories/1";}
    @Step("I send HTTP request Delete")
    public void iSendHTTPRequestDelete() {SerenityRest.given().delete(iSetDeleteEndpointss());}
    @Step("I receive valid HTTP responses code 200")
    public void iReceiveValidHTTPResponsesCode() {restAssuredThat(response -> response.statusCode(200));}
    @Step("I set invalid Delete endpoints")
    public String iSetInvalidDeleteEndpoints() {return url + "categori/1";}
    @Step("I send HTTP requests Delete")
    public void iSendHTTPRequestsDelete() {SerenityRest.given().delete(iSetInvalidDeleteEndpoints());}
    @Step("I receive HTTP responses codes 404")
    public void iReceiveHTTPResponsesCodes() {restAssuredThat(response -> response.statusCode(404));}
}
