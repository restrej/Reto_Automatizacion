package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage extends PageObject {

    public static final Target btnCarritoCompras = Target.the("Ir al carrito de compras").located(By.linkText("Ir a mi carrito"));
    public static final Target lblResultadoCarrito = Target.the("Validar que el producto fue agregado exitosamente al carrito de compras").located(By.cssSelector(".product-item .product-name"));
}