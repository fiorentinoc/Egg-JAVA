import java.util.Scanner;
public class Metodos2_ej1 {

    public static Scanner ns = new Scanner(System.in);


    public static void main(String[] args) {
        
        Integer numero = null;
        System.out.println("Por favor ingrese un número:");
        do {
            try {
                numero = solicitarNumero();
            } catch (Exception e) {
                ns.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (numero == null);
        
        if (esPar(numero)) {
            System.out.println("El "+numero+" es par");
        }else {
            System.out.println("El "+numero+" es impar");

        }
    }
    public static int solicitarNumero() {
        String numero = ns.nextLine();
        int num = Integer.parseInt(numero);
        return num;
    }
    public static boolean esPar(int num) {
        boolean res = (num % 2 == 0);
        return res;
        }

}
