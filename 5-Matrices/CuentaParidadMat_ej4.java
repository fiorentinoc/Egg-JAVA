public class CuentaParidadMat_ej4 {
    public static void main(String[] args) {
        int[][] matriz = {{5,3,2}, {8,1,5}, {1,2,3}};
        int contPar = 0;
        int contImpar = 0;
        
        System.out.println("Elementos Pares e Impares del Arreglo:");
        for (int i = 0; i < matriz.length; i++ ){
            for (int j = 0; j < matriz[i].length; j++ ){
                if (matriz[i][j] % 2 == 0) {
                    contPar++;
                    System.out.println("["+matriz[i][j]+"] es PAR");

                } else {
                    contImpar++;
                    System.out.println("["+matriz[i][j]+"] es IMPAR");
                }
            }
            System.out.println();
        }
        System.out.println("Elementos PARES: " + contPar);
        System.out.println("Elementos IMPARES: " + contImpar);
    }
}
