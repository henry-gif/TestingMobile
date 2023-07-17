package com.bdd.Stepdefinition;

import com.bdd.Steps.EscuelaSteps;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import java.net.MalformedURLException;

public class EscuelaStepdefs {
    private EscuelaSteps escuelaSteps;
    @Before()
    private  void beforeEscenario(){
       escuelaSteps= new EscuelaSteps();
    }

   @Dado("abro la aplicacion")
    public void AbroLaAplicacion() throws MalformedURLException {
        EscuelaSteps.abrirAplicacion();

   }

    @Cuando("selecciono la opcion buscar")
    public void seleccionoLaOpcionBuscar() {
        escuelaSteps.seleccionoLaOpcionBuscar();
    }

    @Y("digito la musica {string}")
    public void digitoLaMusica(String musica) {
        escuelaSteps.digitoLaMusica(musica);
    }

    @Entonces("verifico en la lista la musica ingresada")
    public void verificoEnLaListaLaMusicaIngresada() {
        escuelaSteps.verificoEnLaListaLaMusicaIngresada();
    }
}
