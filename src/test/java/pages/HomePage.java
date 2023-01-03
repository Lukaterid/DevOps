package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BaseClass;

public class HomePage extends BaseClass {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    By locatorBtnOfertas = By.xpath("(//a[@class='nav-menu-item-link'])[1]");
    By locatorTxtOfertas = By.xpath("//h1[contains(text(),'Ofertas')]");
    public void buscarOfertasCelulares(){
        esperarXSegundos(2000);
        click(locatorBtnOfertas);
        esperarXSegundos(1000);
    }
    public String obtenerTxtOfertas(){
        WebElement valor = driver.findElement(locatorTxtOfertas);
        String texto = valor.getText();
        return texto;
    }
}
