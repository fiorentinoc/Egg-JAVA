import java.util.Scanner;
public class Primos2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Ingrese un número (mayor que 1): ");
            numero = input.nextInt();
            
            if (numero <= 1) {
                System.out.println("El número debe ser mayor que 1. Inténtelo de nuevo.");
            }
        } while (numero <= 1);
        
        boolean esPrimo = true;
        int divisor = 2;
        
        do {
            if (numero % divisor == 0) {
                esPrimo = false;
                
            }
            
            divisor++;
        } while (divisor <= Math.sqrt(numero));
        
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }
}
