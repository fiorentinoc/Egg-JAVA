public class SumaElementos_ej2 {
    public static void main(String[] args) {
        int[][] matriz = {{5,3,2}, {8,1,5}, {1,2,3}};
        int suma = 0;
        System.out.println("Suma de los elementos del Arreglo:");
        for (int i = 0; i < matriz.length; i++ ){
            for (int j = 0; j < matriz[i].length; j++ ){
                suma = suma + matriz[i][j];
                System.out.print("["+matriz[i][j]+"]");

            }
            System.out.println();
        }
        System.out.println("La suma es: " + suma);
    }
}
