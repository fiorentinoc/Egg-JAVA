import java.util.Scanner;

public class MiSegPrograma {
    public static void main(String[] args) {
        Scanner pepe = new Scanner(System.in);
        System.out.print("Por favor, ingrese un nombre: ");
        String nombre = pepe.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = pepe.nextInt();
        System.out.println(nombre + " tiene " + edad + " años!");
        pepe.close();
    }
}
