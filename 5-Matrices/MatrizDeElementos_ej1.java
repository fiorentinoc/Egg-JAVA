import java.util.Arrays;

public class MatrizDeElementos_ej1 {
    public static void main(String[] args) {
        
        int[][] matriz = {{5,3,2}, {8,1,5}, {1,2,3}};
        System.out.println("Formato de Matriz:");
        for (int i = 0; i < matriz.length; i++ ){
            System.out.println(Arrays.toString(matriz[i]));
        }

        System.out.println();
        System.out.println("Formato de Arreglo:");
        for (int i = 0; i < matriz.length; i++ ){
            for (int j = 0; j < matriz[i].length; j++ ){
                System.out.print("["+matriz[i][j]+"]");

            }
            System.out.println();
        }
    }
}