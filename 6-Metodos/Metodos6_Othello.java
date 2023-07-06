import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Metodos6_Othello {

    public static Scanner ns = new Scanner(System.in);
    
    //crea tablero
    public static String[][] crearTablero() {
        String[][] tab = new String[9][9];
        for (int i=0; i < tab.length; i++) {
            for (int j=0; j < tab[i].length; j++) {
                if (i==0) {
                    tab[i][j] = String.valueOf(j);
                }else{
                    if (j==0) {
                        tab[i][j] = String.valueOf(i);
                    } else {
                        tab[i][j] = "O";
                        
                    }
                    
                }
            }
        }
        tab[4][4] = "B";
        tab[5][5] = "B";
        tab[4][5] = "N";
        tab[5][4] = "N";

        return tab;
    }
    public static void mostrarTablero(String[][] tab) {
        System.out.println("Juego OTHELLO:");
        System.out.println();
        for (int i=0; i < tab.length; i++) {
            for (int j=0; j < tab[i].length; j++) {
                System.out.print(" "+tab[i][j]);;
            }
            System.out.println();
        }
    }
    public static int[] pedirCoordenada() {
        System.out.print("Ingrese coordenada :");
        int fila = ns.nextInt();
        int col = ns.nextInt();
        
        int[] pos = {fila, col};
        return pos;
    }

    public static void main(String[] args) {
        String[][] tablero  = crearTablero();
        mostrarTablero(tablero);
        int[] coor = pedirCoordenada();
        System.out.println(Arrays.toString(coor));
    }
}
