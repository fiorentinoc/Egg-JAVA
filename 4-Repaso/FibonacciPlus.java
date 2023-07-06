import java.util.Scanner;

public class FibonacciPlus {
    public static void main(String[] args) {
            Scanner miScanner = new Scanner(System.in);
            System.out.println("Ingrese la posicion a mostrar de la serie Fibonacci: ");
            int pos = miScanner.nextInt();
            int fibo = 0;
            int terminos = 1;
            int num1 = 0;
            int num2 = 1;

            if (pos==0) {
                fibo = 0;
            }
            if (pos==1) {
                fibo = 1;
            } else {
                while (terminos < pos) {
                    fibo = num1 + num2;
                    num1 = num2;
                    num2 = fibo;
                    terminos++;
                }
                System.out.println(fibo);

            }
        }

    }

