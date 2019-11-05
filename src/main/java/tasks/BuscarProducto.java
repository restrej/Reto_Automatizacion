package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterfaces.CarritoPage;
import userinterfaces.ProductoPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProducto implements Task {

    private String producto; //Se crea una variable para recibir lo que envia el StepDefinitions

    public BuscarProducto(String producto){
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Entrar el valor en el target que estoy mapeando
                //Y luego presionar la tecla Enter
                Enter.theValue(producto).into(ProductoPage.txtBuscarProducto).thenHit(Keys.ENTER),
                Click.on(ProductoPage.lblNombreProducto),
                Click.on(ProductoPage.btnAgregarProducto),
                Click.on(CarritoPage.btnCarritoCompras)
        );
    }
    public static BuscarProducto enPromart(String producto){
        return instrumented(BuscarProducto.class,producto);
    }
}