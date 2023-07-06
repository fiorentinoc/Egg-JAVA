package src;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num = 15;
        System.out.println("El doble de 15 es: " + doblar(num));
        System.out.println("El triple de 15 es: " + triple(num));
    }
    
    public static int doblar(int num){
        return num * 2;
    }

    public static int triple(int num) {
        return num * 3;
    }
}
