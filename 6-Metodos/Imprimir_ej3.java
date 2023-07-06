import java.util.Scanner;
public class Imprimir_ej3 {
    public static void main(String[] args) {
        Scanner pepe = new Scanner(System.in);
        System.out.println("Por favor ingrese un nombre:");
        String nombre = pepe.nextLine();
        System.out.println("Por favor ingrese una edad:");
        int edad = pepe.nextInt();
        imprimirNombreYEdad(nombre, edad);
    }
    public static void imprimirNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo "+nombre+" y tengo "+edad+" años");
    }
}

