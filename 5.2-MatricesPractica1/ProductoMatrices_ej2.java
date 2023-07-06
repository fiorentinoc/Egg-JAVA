/* Multiplicar dos matrices: La multiplicación de matrices es un poco más complicada que la suma. Para multiplicar dos matrices, necesitas 
seguir estos pasos para cada elemento de la matriz resultante:
Multiplica cada elemento de una fila de la primera matriz por el elemento correspondiente de una columna de la segunda matriz.
Suma todos esos productos.
Ese es el valor del elemento en la fila y columna correspondientes de la matriz resultante.
Por ejemplo:
[1, 2] [5, 6] [(1*5 + 2*7),  (1*6 + 2*8)] [19, 22]
[3, 4] [7, 8] [(3*5 + 4*7), (3*6 + 4*8)] [43, 50] */

import java.util.Arrays;

public class ProductoMatrices_ej2 {
    public static void main(String[] args) {
        int[][] matrizA = {{5,3,2}, {8,1,5}, {1,2,3}};
        int[][] matrizB = {{4,5,1}, {3,1,1}, {9,2,3}};
        int[][] matrizProducto = {{0,0,0}, {0,0,0}, {0,0,0}};
        
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
        System.out.println("Matriz A X B:");

        for (int i = 0; i < matrizProducto.length; i++ ){
            for (int j = 0; j < matrizProducto[i].length; j++ ){
                elemA = matrizA[i][j];
                elemB = matrizB[j][i];
                matrizProducto[i][j] = elemA * elemB;

            }
            
        }
        for (int i = 0; i < matrizProducto.length; i++ ){
            System.out.println(Arrays.toString(matrizProducto[i]));
        }

    }
}
