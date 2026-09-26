// create a program to reverse an array
public class Sixth {
    public static void main(String[] args){
        int[] arr = ArrayUtility.inArray();
        reverseofArray(arr);
        new ArrayUtility().displayArray(arr);
    }
    public static int[] reverseofArray(int[] arr){
        // int[] revarr= new int[arr.length];
        int i = 0;
       while(i<arr.length/2){
        int swap = arr[i];
        arr[i]=arr[(arr.length-1)-i];
        arr[(arr.length-1)-i]=swap;
        i++;
       }
       return arr;
    }
}
