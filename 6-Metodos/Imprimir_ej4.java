import java.util.Scanner;
public class Imprimir_ej4 {

    public static Scanner pepe = new Scanner(System.in);

    public static void main(String[] args) {

        String nombre = obtenerNombre();
        String edad = obtenerEdad(); 
        imprimirNombreYEdad(nombre, edad);
    }

    public static void imprimirNombreYEdad(String nombre, String edad) {
        System.out.println("Me llamo "+nombre+" y tengo "+edad+" años");
    }

    public static String obtenerNombre() {
        System.out.println("Por favor ingrese un nombre:");
        return pepe.nextLine();
    }

    public static String obtenerEdad() {
        System.out.println("Por favor ingrese una edad:");
        return pepe.nextLine();
    }
}
