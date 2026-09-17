import java.util.Scanner;
public class Third {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        System.out.println("factorial of "+num+" is " +factoNum(num));
         
    }
    public static int factoNum(int num){
        if (num==1){
            return 1;
        }
        int i = 2;
        int facto =1;
        while(i<=num){
            facto *=i;
            i++;
        }
        return facto;

    } 
}
