//Solicitar al usuario que introduzca un número y verificar si es primo utilizando un bucle do-while. 
// Un número es primo si solo tiene dos divisores: 1 y él mismo. 
//Si el número no es primo, pedir al usuario que introduzca otro número hasta que introduzca un número primo.
/* import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int N = miScanner.nextInt();
        boolean esPrimo = true;
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                esPrimo = false;
            }}
            if (esPrimo){
                System.out.println("Es Primo.");
            } else {
                System.out.println("NO es Primo");
            }
        }
    } */

import java.util.Scanner;
public class Primos {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        boolean esPrimo = true;
        do {
            System.out.println("Introduzca un numero: ");
            int n = miScanner.nextInt();
    
            int i = 2;
            
            do {
                int mod = n % i;
                if (mod==0 && n!=2) {
                    esPrimo = false;
                } else {
                    esPrimo = true;
                }
                System.out.println(esPrimo);
                i++;
    
            } while (i<n && esPrimo);
    
            if (esPrimo) {
                System.out.println("El número "+n+" ES PRIMO.");
            } else {
                System.out.println("El número "+n+" NO ES PRIMO.");
            }
            
        } while (!esPrimo);
    }
}
