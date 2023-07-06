public class Fibonacci {
    public static void main(String[] args) {
        int terminos = 1;
        int num1 = 0;
        int num2 = 1;

        System.out.println(num1);
        System.out.println(num2);
        while (terminos < 10) {
            int suma = num1 + num2;
            num1 = num2;
            num2 = suma;
            System.out.println(num2);
            terminos++;
        }
    }
}
