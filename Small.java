import java.util.Scanner;

public class Small {
    public static void main(String[] args) {
        int ans=small();
        System.out.println("smallest num is " +ans);

    }
    static int small(){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the num1:");
        int a=in.nextInt();
        System.out.print("enter the num2:");
        int b=in.nextInt();
        if (a<b){
            return a;}
        else{
            return b;
        }
    }
}
