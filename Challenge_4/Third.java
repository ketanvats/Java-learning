// to find maximum and minimum element in an array
import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        System.out.println("Maximum element in the array is "+maxarray());
        System.out.println("Minimum element in the array is "+minarray());
    }
    public static int[] arrInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int i =0;
        int[] arr = new int[size];
        while(i<arr.length){
            System.out.print("Enter the element for "+(i+1)+" : ");
            arr[i]=sc.nextInt();
            i++;
        }
        return arr;
    }
    public static int maxarray(){
        int[] arr=arrInput();
        int i = 0;
        int max= 0;
        while(i<arr.length){
            if (arr[i]>max){
                max=arr[i];
            }
            i++;
        }
        return max;
    }
    public static int minarray(){
        int[] arr=arrInput();
        int i = 0;
        int min=Integer.MAX_VALUE;
        while(i<arr.length){
            if (arr[i]<min){
                min=arr[i];
            }
            i++;
        }
        return min;
    }
}
