import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner in =new Scanner(System.in);
        System.out.print("enter the num1:");
        int a=in.nextInt();
        System.out.print("enter the num2:");
        int b=in.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }


}