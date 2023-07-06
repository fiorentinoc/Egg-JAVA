import java.util.Scanner;

public class PrimosPlus {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        boolean esPrimo = true;
        int cont = 0;
        int num = 2;
        int i = 2;

        System.out.println("Cuantos numeros primos desea obtener? :");
        int n = miScanner.nextInt();
        do {
            //System.out.println("hola"+n);
            while (i <= num) {
                int mod = num % i;
                if (mod==0 && num!=2) {
                    esPrimo = false;
                } else {
                    esPrimo = true;
                }
                if (esPrimo) {
                System.out.println(num);
                num++;
                cont++;
                }else{
                    num++;
                }
                
            }    
        
                /* } while (i<num && esPrimo);
                if (esPrimo) {
                    System.out.println(num);
                    num++;
                    } 
                cont++;*/
        } while (cont != n);
        
    }
}