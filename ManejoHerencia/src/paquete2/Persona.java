
package paquete2;

/**
 *
 * @author usuario
 */
public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String n, String a) {
        this.nombre = n;
        this.apellido = a;
    }
    
    public void establecerNombre(String tipo) {
        this.nombre = tipo;
    }

    public void establecerApellido(String tipo) {
        this.apellido = tipo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

}
