// create a program to return a new array deleting a apecific element
import java.util.Scanner;
public class Fifth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inArray();
        System.out.print("Enter elements to delete: ");
        int numTodelete=input.nextInt();
        int[] newarr = deleteNumber(arr,numTodelete);
        System.out.print("New array after deletion: ");
        new ArrayUtility().displayArray(newarr);
        
    }
    public static int[] deleteNumber(int[] arr,int numTodelete){
        int occ =Second.occElement(arr,numTodelete);
        int nsize = arr.length - occ;
        int[] newarr=new int[nsize];
        int i =0 ; int j=0;
        while(i<arr.length){
        if(arr[i]!=numTodelete){
            newarr[j]=arr[i];
            j++;
        }
            i++;
}
        return newarr;
    }
}
