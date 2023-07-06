/*
  1. Solicitar al usuario que ingrese su nombre, guardarlo en una variable e imprimir el dato. 
  2. Solicitar al usuario que ingrese un número, guardarlo en una variable e imprimir el dato. 
  3. Solicitar al usuario su nombre, luego solicita su edad e imprime en pantalla un mensaje 
     que diga “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”. 
*/

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
