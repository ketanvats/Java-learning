// to get array input from the user
import java.util.Scanner;
public class ArrayUtility {
    public static int[] inArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of element: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i =0;
        while (i<arr.length){
            System.out.print("Enter the element of "+(i+1)+" "+":");
            arr[i]=input.nextInt();
            i++;
        }
        return arr;
    }
    public void displayArray(int[] arr){
        int i =0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
             i++;
        }
        System.out.println();
    }
}
