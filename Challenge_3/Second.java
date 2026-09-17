import java.util.Scanner;
public class Second{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number:");
        int num = scanner.nextInt();
         System.out.println("Sum of odd of "+num+" is"+oddSumResult(num));
    }
    
    public static int oddSumResult(int num){
        int i = 1;
        int odd=0;
        while(i<num){
            odd +=i;
            i+=2;
            
                   }
            return odd;

    }

    }
