/* Sumar dos matrices de la misma dimensión: La suma de dos matrices se realiza sumando cada elemento correspondiente en las dos matrices. 
Por ejemplo, si tienes dos matrices A y B, el elemento en la primera fila y la primera columna de la matriz sumada C sería 
la suma del elemento en la primera fila y la primera columna de A y el mismo elemento de B.

[1,  2, 3] [10,  20, 30]  [11,   22, 33]
[4, 5, 6]  + [40, 50, 60] = [44, 55, 66]
[7, 8, 9] [70, 80, 90] [77,  88, 99] */

import java.util.Arrays;

public class SumaMatrices_ej1 {
    public static void main(String[] args) {

        int[][] matrizA = {{5,3,2}, {8,1,5}, {1,2,3}};
        int[][] matrizB = {{4,5,1}, {3,1,1}, {9,2,3}};
        int[][] matrizSuma = {{0,0,0}, {0,0,0}, {0,0,0}};
        
        int elemA = 0;
        int elemB = 0;

        System.out.println("Matriz A:");
        for (int i = 0; i < matrizA.length; i++ ){
            System.out.println(Arrays.toString(matrizA[i]));
        }
        System.out.println("Matriz B:");
        for (int i = 0; i < matrizB.length; i++ ){
            System.out.println(Arrays.toString(matrizB[i]));
        }

        System.out.println();
        System.out.println("Matriz A + B:");

        for (int i = 0; i < matrizSuma.length; i++ ){
            for (int j = 0; j < matrizSuma[i].length; j++ ){
                elemA = matrizA[i][j];
                elemB = matrizB[i][j];
                matrizSuma[i][j] = elemA + elemB;

            }
            
        }
        for (int i = 0; i < matrizSuma.length; i++ ){
            System.out.println(Arrays.toString(matrizSuma[i]));
        }



    }
}