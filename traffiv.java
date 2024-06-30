import java.util.Scanner;

public class traffiv {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        if(a.equals("red")){
            System.out.println("Stop");
        } else if (a.equals("orange")) {
            System.out.println("Get ready");
        } else if (a.equals("green")) {
            System.out.println("Go");
        }
    }
}
