/*  Matriz espiralada: Pedir al usuario dos números para crear una matriz “tamaño1 x tamaño2” y 
luego rellenarla de forma espiralada en sentido horario, comenzando desde (0,0). 
Por ejemplo, una matriz 3x4 se llenaría de la siguiente manera:

[1, 2, 3, 4]

[10, 11 , 12 ,5]

[9, 8, 7, 6] */

import java.util.Scanner;
import java.util.Arrays;


public class MatrizCaracol_ej4 {

    public static void main(String[] args) {
        try (Scanner miScanner = new Scanner(System.in)) {
            System.out.print("Introduzca cantidad de filas: ");
            int fila = miScanner.nextInt();
            System.out.print("Introduzca cant de columnas: ");
            int col = miScanner.nextInt();
        
            int[][] mat = new int[fila][col];
            int contador = 1;
            int ColInicial = 0;
            int ColFinal = col - 1;
            int filaInicial = 0;
            int filaFinal = fila -1;

            while (filaInicial <= filaFinal && ColInicial <= ColFinal){
                for (int i = ColInicial; i <= ColFinal; i++){
                    mat[filaInicial][i] = contador;
                    contador++;
                    }
                filaInicial++;

                for (int j = filaInicial; j <= filaFinal; j++){
                    mat[j][ColFinal] = contador;
                    contador++;
                    }
                ColFinal--;

                for (int l = ColFinal; l >= ColInicial; l--){
                    mat[filaFinal][l] = contador;
                    contador++;
                    }
                filaFinal--;

                for(int y = filaFinal; y >= filaInicial; y--){
                    mat[y][ColInicial] = contador;
                    contador++;
                    }
                ColInicial++;
                }
                System.out.println();
                System.out.println("Matriz Caracol:");
                for (int i = 0; i < mat.length; i++ ){
                System.out.println(Arrays.toString(mat[i]));
                }
            }
        }
    }