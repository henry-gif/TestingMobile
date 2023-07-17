package com.bdd.View;

import MobileDriverManager.Util;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class EscuelaView extends Util {


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Buscar\"]")
    private MobileElement buscar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Buscar algo para escuchar\"]")
    private MobileElement input;


    public void digitar(String musica) {
    }

    public void verificar() {
    }

    public void seleccionoLaOpcionBuscar() {
        buscar.click();
    }
}
