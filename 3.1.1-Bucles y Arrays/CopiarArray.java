import java.util.Arrays;
import java.util.Scanner;


public class CopiarArray {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : arr1) {
            System.out.println("arr1[" + (i-1) + "]: " + arr1[i-1]);
            
        }

        System.out.println("Indique indice inicial para copiar: ");
        int iInicial = miScanner.nextInt();
        System.out.println("Indique indice final para copiar: ");
        int iFinal = miScanner.nextInt();
        
        System.out.println("Ud. pidió copiar desde indice " + iInicial + " hasta indice " + iFinal + ":");
        
        int[] parteDeUnArray = Arrays.copyOfRange(arr1, iInicial, (iFinal+1));
        System.out.println(Arrays.toString(parteDeUnArray));
        
        for (int i=0; i < parteDeUnArray.length; i++) {
            //System.out.println(i);
            System.out.println(i+"copia["+ (i) +"]: "+parteDeUnArray[i]);
            
        }
            
        


    }
}