import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1 = in.nextInt();
        System.out.print("Enter the number2: ");
        int num2 = in.nextInt();
        System.out.print("Enter the operator(+ - * /): ");
        String op = in.next();
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
