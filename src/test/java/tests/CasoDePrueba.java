package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.PropertiesDriven;

import java.util.ArrayList;

public class CasoDePrueba {
    private HomePage homePage;
    private WebDriver driver;
    private final String browser = PropertiesDriven.getProperty("browser");
    private final String propertyDriver = PropertiesDriven.getProperty("propertyDriver");
    private final String urlDriver = PropertiesDriven.getProperty("urlDriver");
    private final String url = PropertiesDriven.getProperty("url");

    @BeforeMethod
    public void preparacionTests(){
        homePage = new HomePage(driver);
        homePage.conexionBrowser(browser,propertyDriver,urlDriver);
        homePage.cargarPagina(url);
        homePage.maximizarBrowser();
    }

    @AfterMethod
    public void posTests(){
        homePage.cerrarBrowser();
    }

    @Test
    public void CP001_Busqueda_Ofertas_Celulares(){
        homePage.buscarOfertasCelulares();
        Assert.assertEquals("Ofertas",homePage.obtenerTxtOfertas());
    }
}
