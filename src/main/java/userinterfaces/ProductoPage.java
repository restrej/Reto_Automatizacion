package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductoPage extends PageObject {

    public static final Target txtBuscarProducto = Target.the("Buscar producto en promart").located(By.id("i-search"));
    public static final Target lblNombreProducto = Target.the("Seleccionar producto en promart").locatedBy("//*[text()='Videojuego Ps4 Farpoint']");
    public static final Target btnAgregarProducto = Target.the("Agregar producto al carrito de compras").located(By.className("js-addProdCart"));
}
