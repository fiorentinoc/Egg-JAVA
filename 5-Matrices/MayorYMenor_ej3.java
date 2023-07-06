public class MayorYMenor_ej3 {
    public static void main(String[] args) {
        
        int[][] matriz = {{5,3,2}, {8,1,5}, {1,2,3}};
        int numeroMayor = matriz[0][0];
        int numeroMenor = matriz[0][0];
        String mayorPosicion = "0,0";
        String menorPosicion = "0,0";
        
        System.out.println("Elemento Mayor y Menor del Arreglo:");
        
        for (int i = 0; i < matriz.length; i++ ){
            System.out.print("[ ");
            for (int j = 0; j < matriz[i].length; j++ ){
                System.out.print(matriz[i][j]+" ");
                if (matriz[i][j] > numeroMayor) {
                    numeroMayor = matriz[i][j];
                    mayorPosicion = i + "," + j;
                }
                if (matriz[i][j] < numeroMenor) {
                    numeroMenor = matriz[i][j];
                    menorPosicion = i + "," + j;
                }
            }
            System.out.println("]");
            //System.out.println();
        }
        System.out.println("El número MAYOR de la matriz es " + numeroMayor + " en la posición " + mayorPosicion);
        System.out.println("El número MENOR de la matriz es " + numeroMenor + " en la posición " + menorPosicion);
    }
}
