package program;

public class Pattern {
    public static void main(String args[]){
        firstPattern();
    }
    public static void firstPattern(){
        int rows = 0;
        while(rows<5){
            System.out.print("*");
            int i =0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows ++;
        }
        
    }
}
