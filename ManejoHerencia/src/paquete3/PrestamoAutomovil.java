
package paquete3;

import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes 
 * 
 */
public class PrestamoAutomovil extends Prestamo {

    String tipoAuto;
    String marcaAuto;
    Persona garante1;
    double valorAuto;
    double pagoMensual;

    public PrestamoAutomovil(String tipoAuto, String marcaAuto, Persona garante1,
            double valorAuto, int tiempoPrestamo, String ciudad) {
        super(garante1, tiempoPrestamo, ciudad);
        this.tipoAuto = tipoAuto;
        this.marcaAuto = marcaAuto;
        this.garante1 = garante1;
        this.valorAuto = valorAuto;
    }

    public void establecerMarcaAuto(String tipo) {
        this.marcaAuto = tipo;
    }

    public void establecerGarante1(Persona tipo) {
        this.garante1 = tipo;
    }

    public void establecerValorAuto(double tipo) {
        this.valorAuto = tipo;
    }

    public void establecerPagoMensual() {
        this.pagoMensual = valorAuto / tiempoPres;
    }

    public String obtenerMarcaAuto() {
        return marcaAuto;
    }

    public Persona obtenerGarante1() {
        return garante1;
    }

    public double obtenerValorAuto() {
        return valorAuto;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }
   
    @Override
    public void establecerCiudadPres(String ciudad) {
        this.ciudadPres = ciudad.toLowerCase();
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n==========Prestamo del Automovil:===="
                + "======\n"
                + "   > Tipo de automóvil: %s\n"
                + "   > Marca de automóvil: %s\n"
                + "   > Garante: %s %s\n"
                + "   > Valor del automóvil: %.2f$\n"
                + "   > valor mensual a pagar: %.2f$",
                cadenaFinal,
                tipoAuto,
                marcaAuto,
                bene.obtenerNombre(),
                bene.obtenerApellido(),
                valorAuto,
                pagoMensual);

        return cadenaFinal;
    }

}
