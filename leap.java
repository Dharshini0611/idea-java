import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        if(a%4==0 && a%100!=0 || a%400==0){
            System.out.println("it is a leap year");}
        else {
            System.out.println("its is not a leap year");


            }

    }
}
