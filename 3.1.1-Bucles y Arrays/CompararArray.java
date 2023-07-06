import java.util.Arrays;

public class CompararArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] arr3 = {1, 4, 3, 2, 5, 6};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        boolean esIgual = Arrays.equals(arr1, arr2);
        
        if (esIgual) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays son distintos");
        }
    }
}
