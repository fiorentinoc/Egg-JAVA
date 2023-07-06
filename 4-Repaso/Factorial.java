/* Escribir un programa que solicite al usuario un número y calcule su factorial utilizando un bucle do-while. 
💡 El factorial de un número es el producto de todos los números desde 1 hasta ese número. Te compartimos algunos ejemplos:
El factorial de 3 es 1 * 2 * 3 = 6.
El factorial de 5 es 1 * 2 * 3 * 4 * 5 = 120.
El factorial de 7 es 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040. */

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = miScanner.nextInt();
        
        int prod = 1;
        int i = 1;
        do {
            prod = prod * i;
            i++;
        } while (i <= n);
        System.out.println("El factorial es: " + prod);

    }
} 

