package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.CarritoPage.lblResultadoCarrito;


public class VerificarCarrito implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(lblResultadoCarrito).viewedBy(actor).asString();
    }

    public static VerificarCarrito nombreProducto() {
        return new VerificarCarrito();
    }
}