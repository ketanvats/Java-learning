// to get sum and average of the array
public class First{
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inArray();
        System.out.println("Sum of element "+"is "+sumArray(arr));
        System.out.println("Average "+"is "+avgArray(arr));
    }
    public static int sumArray(int[] arr){
        int sum = 0;
        int i = 0;
        while(i<arr.length){
        sum+=arr[i];
        i++;
    }
    return sum;

    }
     public static int avgArray(int[] arr){
        return (sumArray(arr)/arr.length);
    }
}