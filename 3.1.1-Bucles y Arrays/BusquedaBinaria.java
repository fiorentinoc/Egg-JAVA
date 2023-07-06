import java.util.Arrays;

public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] arrayEnteros = {1, 3, 4, 5, 6, 10};
        System.out.println(Arrays.toString(arrayEnteros));
        int index = Arrays.binarySearch(arrayEnteros, 5);
        System.out.println("El valor buscado se encuentra en la posicion "+ index +" del array.");
        
        String[] arrayFrutas = {"manzana", "pera", "limon", "anana"};
        System.out.println(Arrays.toString(arrayFrutas));
        int index2 = Arrays.binarySearch(arrayFrutas, "pera");
        System.out.println("La pera se encuentra en la posicion "+ index2 +" del array.");
    }
}
