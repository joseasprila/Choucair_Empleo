package stepdefinitions;

import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.IrAlPortalDeEmpleo;
import userinterfaces.PaginaInicio;

import java.util.List;

public class EjemploChoucairSteps2 {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor =Actor.named("Global");
    private PaginaInicio paginaInicio = new PaginaInicio();



    @Dado("^que el usuario ingresa a la sesion de empleo choucair$")
    public void queElUsuarioIngresaALaSesionDeEmpleoChoucair() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(paginaInicio));


    }


    @Cuando("^el navegue a la pagina de ir al portal de empleo$")
    public void elNavegueALaPaginaDeIrAlPortalDeEmpleo() {
        actor.wasAbleTo(

        );

    }

    @Entonces("^el debe visualizar otra pagina web donde se muestre la informacion de la pagina empleochoucairtesting$")
    public void elDebeVisualizarOtraPaginaWebDondeSeMuestreLaInformacionDeLaPaginaEmpleochoucairtesting() {

    }

    @Cuando("^el navegue a la pagina de ir al portal de empleo choucair$")
    public void elNavegueALaPaginaDeIrAlPortalDeEmpleoChoucair(List<String> datos) {

    }

    @Entonces("^el debe visualizar otra pagina web donde se muestre la informacion de la pagina empleochoucairtest$")
    public void elDebeVisualizarOtraPaginaWebDondeSeMuestreLaInformacionDeLaPaginaEmpleochoucairtest() {

    }
}
