import java.util.Arrays;

public class OrdenInversoMat_ej5 {
    public static void main(String[] args) {
        int[][] matriz = {{5,3,2}, {8,1,5}, {9,5,6}};
        System.out.println("Formato de Matriz:");
        for (int i = 0; i < matriz.length; i++ ){
            System.out.println(Arrays.toString(matriz[i]));
        }

        System.out.println();
        System.out.println("Matriz Invertida:");
        for (int i = matriz.length-1; i >=0 ; i-- ){
            for (int j = matriz[i].length-1; j >=0 ; j-- ){
                //suma = suma + matriz[i][j];
                System.out.print("["+matriz[i][j]+"]");

            }
            System.out.println();
        //for (int i = matriz.length-1; i >= 0 ; i-- ){
        //    System.out.println(Arrays.toString(matriz[i]));
        }
    }
}
