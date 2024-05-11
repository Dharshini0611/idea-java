import java.util.Scanner;

public class vamo {
    public static void main(String[] agrs){
        Scanner in =new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1 =in.nextInt();
        System.out.println("enter the second number:");
        int num2= in.nextInt();
        System.out.println("enter the operators(*,%,/,+,-)");
        String op=in.next();
        int ans = 0;

        if(op.equals("+")){
            ans = num1 + num2;
        } else if (op.equals("-")){
            ans = num1 - num2;

        } else if (op.equals("*")) {
            ans = num1 * num2;
        }
        else if (op.equals("/")) {
            ans = num1 / num2;
        }
        System.out.println(ans);




    }
}
