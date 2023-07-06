import java.util.Scanner;

public class MetodoCalculadora {
    
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Calculadora");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error: No se puede dividir por cero.");
                        } else {
                            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                        }
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    public static void main(String[] args) {
        menu();
    }
}
