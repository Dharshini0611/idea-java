import java.util.Scanner;

public class MUlt {
    public static void main(String[] args) {
    int ans=product();
        System.out.println(ans);
    }
    static int product(){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=a*b;
         return c;
    }
}
