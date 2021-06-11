package paquete1;

import java.util.Scanner;
import java.util.Locale;
import paquete2.Persona;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes; María Alejandra Paute Eras; Nixon Javier Vuele Irene
 *
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
        int eleccionSalida = 1;
        boolean salida = true;
        do {
            System.out.printf("Que prestamo desea realizar:\n1) Prestamo "
                    + "Automovil\n2) Prestamo Educativo\n> ");
            int tipoPrestamo = leer.nextInt();
            leer.nextLine();
            System.out.printf("Ingrese el nombre del Cliente:\n> ");
            String nombreClient = leer.nextLine();
            System.out.printf("Ingrese el apellido del Cliente:\n> ");
            String apellidoClient = leer.nextLine();
            System.out.printf("Ingrese el tiempo de préstamo en meses:\n> ");
            int tiempoMeses = leer.nextInt();
            System.out.printf("Ingrese la ciudad del banco:\n> ");
            leer.nextLine();
            String city = leer.nextLine();
            Persona cliente = new Persona(nombreClient, apellidoClient);
            if (tipoPrestamo == 1) {
                System.out.printf("Ingrese el tipo de automovil:\n> ");
                String tipoAuto = leer.nextLine();
                System.out.printf("Ingrese la marca del vehiculo:\n> ");
                String marcaVehi = leer.nextLine();
                System.out.printf("Ingrese el costo de su Vehiculo:\n> ");
                Double valorVehi = leer.nextDouble();
                PrestamoAutomovil prestamosAutoX = new PrestamoAutomovil(
                        tipoAuto, marcaVehi, cliente, valorVehi, tiempoMeses,
                        city);
                prestamosAutoX.establecerCiudadPres(city);
                prestamosAutoX.establecerPagoMensual();
                System.out.println(prestamosAutoX);
            } else {
                System.out.printf("Ingrese su nivel de estudios:\n> ");
                String nivelEstudio = leer.nextLine();
                System.out.printf("Ingrese el nombre del centro Educativo:"
                        + "\n> ");
                String centroEducativo = leer.nextLine();
                System.out.printf("Ingrese el costo de la carrera:\n> ");
                double valorCarrera = leer.nextDouble();
                PrestamoEducativo prestamosEduX = new PrestamoEducativo(
                        nivelEstudio, centroEducativo, valorCarrera, cliente, 
                        tiempoMeses,
                        city);
                prestamosEduX.establecerCiudadPres(city);
                prestamosEduX.establecerPagoMensual();
                System.out.println(prestamosEduX);
            }

            System.out.printf("\nEliga lo opcion que desea realizar:"
                    + "\n1) Ingresar otro prestamo\n2) Salir del programa\n> ");
            leer.nextLine();
            eleccionSalida = leer.nextInt();
            System.out.println("");
            if (eleccionSalida == 1) {
                salida = true;
            } else {
                System.out.println("\u001B[34m====Gracias por preferirnos====");
                salida = false;
            }

        } while (salida);

    }
}
