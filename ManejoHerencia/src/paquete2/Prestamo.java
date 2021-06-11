package paquete2;

/**
 *
 * @author reroes
 *
 */
public class Prestamo {

    protected Persona bene;
    protected int tiempoPres;
    protected String ciudadPres;

    public Prestamo(Persona b, int t, String c) {
        this.bene = b;
        this.tiempoPres = t;
        this.ciudadPres = c;
    }

    public void establecerBene(Persona tipo) {
        this.bene = tipo;
    }

    public void establecerTiempoPres(int tipo) {
        this.tiempoPres = tipo;
    }

    public void establecerCiudadPres(String tipo) {
        this.ciudadPres = tipo;
    }

    public Persona obtenerBene() {
        return bene;
    }

    public int obtenerTiempoPres() {
        return tiempoPres;
    }

    public String obtenerCiudadPres() {
        return ciudadPres;
    }

    @Override
    public String toString() {
        String cadena = String.format("==========Prestamo del cliente:===="
                + "======\n"
                + "   > Nombre: %s\n"
                + "   > Apellido: %s\n"
                + "   > Tiempo de prestamo: %d meses\n"
                + "   > Ciudad del préstamo: %s\n",
                bene.obtenerNombre(),
                bene.obtenerApellido(),
                obtenerTiempoPres(),
                obtenerCiudadPres());

        return cadena;
    }
}
