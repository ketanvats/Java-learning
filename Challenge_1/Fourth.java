package Challenge_1;
import java.util.Scanner;
public class Fourth {
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter any year: ");
        int year = num.nextInt();
       if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println(year+ " "+"is leap");
        }else{
            System.out.println(year+" "+"is not a leap");
        }
    }
    
}
