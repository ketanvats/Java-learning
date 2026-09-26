//create a programe to check the array is palindrome or not
public class Seventh {
    public static void main(String[] args) {
    int[] arr = ArrayUtility.inArray();
    boolean isPalindrome=palindromeCheck(arr);
    if (isPalindrome){
        System.out.println("The given array is palindrome");
    }else{
        System.out.println("The given array is not a palindrome");
    }
    }
    public static boolean palindromeCheck(int[] arr){
        int i =0;
        while(i<arr.length/2){
            if(arr[i]!=arr[(arr.length-1)-i]){
                return false;
            }
            i++;
        }
        return true;
    }

}

