import java.util.Arrays;
public class CopiarArray2 {
   public static void main(String[] args) {
      short[] shortArr = { 10, 20, 30, 13 };
      System.out.print("Short Array: [");
      for (int i = 0; i < shortArr.length; i++) {
         System.out.print(shortArr[i] + " ");
      }
      System.out.print("]\nCopied Array: \n");

      // Create copy of the array of same size
      short[] shortArrCopy = Arrays.copyOfRange(shortArr, 0, 3);     
      System.out.print("Short Array: [");
      for (int i = 0; i < shortArrCopy.length; i++) {
         System.out.print(shortArrCopy[i] + " ");
      }
      System.out.print("]");
   }
}
