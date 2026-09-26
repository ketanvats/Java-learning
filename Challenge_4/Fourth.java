//check if given array is sorted
import java.util.Scanner;
public class Fourth {
    public static void main (String[] args){
            int[] arr = ArrayUtility.inArray();
            boolean incre = isIncreasing(arr);
            boolean decre = isDecreasing(arr);
            if(incre || decre){
                System.out.println("The array is sorted");
            }else{
                System.out.println("The array is not sorted");
            }
    }
    public static boolean isIncreasing(int[] arr){
        int i = 1;
        boolean result= false;
        while (i<arr.length){
            if (arr[i]<arr[i-1]){
                result = true;
            }
            i++;
        }
        return result;
    }
    public static boolean isDecreasing(int[] arr){
        int i = 1;
        boolean result= false;
        while (i<arr.length){
            if (arr[i]>arr[i-1]){
                result = true;
            }
            i++;
        }
        return result;
    }
   
}
