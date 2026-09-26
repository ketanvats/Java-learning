//to find the occurance of an element in the given array
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int[] arr = arrInput();
        System.out.print("Enter any value to find it's occurance: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("No. of occurence in the given array is "+occElement(arr,num));
    }
    public static int[] arrInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while(i<size){
            System.out.print("Enter element of "+(i+1)+":");
            arr[i]=sc.nextInt();
            i++;
        }
         return arr;
    }
    public static int occElement(int[] arr,int num){
        int i = 0;
        int occurance=0;
        while(i<arr.length){
            if (num==arr[i]){
                occurance++;
            }
            i++;
        }
        return occurance;
    }
}
