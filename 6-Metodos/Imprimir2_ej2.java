import java.util.Scanner;
public class Imprimir2_ej2 {
    public static void main(String[] args) {
        Scanner pepe = new Scanner(System.in);
        System.out.println("Por favor ingrese un nombre:");
        String nombre = pepe.nextLine();
        System.out.println("Por favor ingrese una edad:");
        int edad = pepe.nextInt();
        System.out.println("Me llamo "+nombre+" y tengo "+edad+" años");
    }
}
