import java.util.Scanner;
public class Fourth {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        System.out.println("sum of digit of "+num+" "+" is "+sumDigits(num));
    }
    public static int sumDigits(int num){
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;

        }
        return sum;

    }
}
