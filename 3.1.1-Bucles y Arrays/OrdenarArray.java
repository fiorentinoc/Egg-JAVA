import java.util.Arrays;
public class OrdenarArray {
    public static void main(String[] args) {
        int [] array = {5, 8, 1, 6, 3, 2, 7};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        
    }
}