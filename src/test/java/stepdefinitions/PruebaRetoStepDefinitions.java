package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.VerificarCarrito;
import tasks.AbrirElBrowser;
import tasks.BuscarProducto;
import userinterfaces.InicioPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class PruebaRetoStepDefinitions {

    @Managed(driver="chrome")//Definir el drive para la prueba
    private WebDriver browser;

    private Actor juan=Actor.named("Juan");

    @Page
    private InicioPage inicioPage;


    @Before //Lo que ejecuta antes de la prueba
    public void setUP(){
        juan.can(BrowseTheWeb.with(browser));
    }

    @Given("^que Juan quiere usar la busqueda de promart$")
    public void usarLaBusquedaDePromart() {
        juan.wasAbleTo(AbrirElBrowser.on(inicioPage));
    }

    @When("busca el producto (.*)")
    public void buscaElProducto(String producto) {
        juan.attemptsTo(BuscarProducto.enPromart(producto));
    }

    @Then("validar que fue agregado (.*) al carrito de compras exitosamente")
    public void validarQueFueAgregadoAlCarritoDeComprasExitosamente(String producto) {
        juan.should(seeThat(VerificarCarrito.nombreProducto(), Matchers.containsString(producto)));
    }
}