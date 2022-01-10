package pom.equipo1.test;

import org.junit.Test;
import pom.equipo1.base.TestBase;
import pom.equipo1.pages.*;

public class atc_Alojamientos extends TestBase {
    protected VFHomePage home;
    protected AlojamientoPage alojamiento;
    protected ResultadoAlojamientoPage resultado;

    @Test
    public void atc01_AlojamientoBasico() throws InterruptedException {
        home = new VFHomePage(driver);
        alojamiento = new AlojamientoPage(driver);
        resultado = new ResultadoAlojamientoPage(driver);
        home.irAAlojamiento();
        alojamiento.setAlojamientoBasico();
        resultado.getNumberOfStars();
    }

    @Test
    public void atc02_AlojamientoMedio() throws InterruptedException {
        home = new VFHomePage(driver);
        alojamiento = new AlojamientoPage(driver);
        resultado = new ResultadoAlojamientoPage(driver);
        home.irAAlojamiento();
        alojamiento.setAlojamientoMedio();
        resultado.getSpecf();
    }
}
