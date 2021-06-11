
package paquete4;

import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes 
 * 
 */
public class PrestamoEducativo extends Prestamo {

    String nivelStudio;
    String centroEducativo;
    double valorCarrera;
    double pagoMensual;

    public PrestamoEducativo(String nivelStudio, String centroEducativo,
            double valorCarrera, Persona beneficiario,
            int tiempoPrestamo, String ciudad) {
        super(beneficiario, tiempoPrestamo, ciudad);
        this.nivelStudio = nivelStudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
    }

    public void establecerNivelStudio(String tipo) {
        this.nivelStudio = tipo;
    }

    public void establecerCentroEducativo(String tipo) {
        this.centroEducativo = tipo;
    }

    public void establecerValorCarrera(double tipo) {
        this.valorCarrera = tipo;
    }

    public void establecerPagoMensual() {
        this.pagoMensual = (valorCarrera / tiempoPres)
                - ((10 * (valorCarrera / tiempoPres)) / 100);
    }

    public String obtenerNivelStudio() {
        return nivelStudio;
    }

    public String obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    @Override
    public void establecerCiudadPres(String tipo) {
        this.ciudadPres = tipo.toUpperCase();
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n==========Prestamo Educativo:===="
                + "======\n"
                + "   > Nivel de Estudios: %s\n"
                + "   > Centro Educativo: %s\n"
                + "   > Valor de la carrera: %.2f$\n"
                + "   > valor mensual a pagar: %.2f$",
                cadenaFinal,
                nivelStudio,
                centroEducativo,
                valorCarrera,
                pagoMensual);

        return cadenaFinal;
    }
}
