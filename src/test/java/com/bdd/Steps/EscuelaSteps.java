package com.bdd.Steps;

import MobileDriverManager.MobileDriverManager;
import com.bdd.View.EscuelaView;

import java.net.MalformedURLException;

public class EscuelaSteps {
    private EscuelaView escuelaView(){
        return new EscuelaView();
    }
    public static void abrirAplicacion() throws MalformedURLException {
        MobileDriverManager.CrearDriver();

    }

    public void seleccionoLaOpcionBuscar() {
        escuelaView().seleccionoLaOpcionBuscar();
    }

    public void digitoLaMusica(String musica) {
       // escuelaView().digitar(musica);//
    }

    public void verificoEnLaListaLaMusicaIngresada() {
        escuelaView().verificar();
    }
}
