import java.util.Scanner;
public class Third {
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter First number: ");
    int num1=input.nextInt();
    System.out.print("Enter Second number: ");
    int num2=input.nextInt();
    System.out.print("Enter Third number: ");
    int num3=input.nextInt();
        if(num1<num2){
            System.out.println(num2+" "+"is greater");
        }else if(num1<num3){
            System.out.println(num3+" "+"is greater");
        }else{
            System.out.println(num1+" "+"is greater");
        }
    }
}
