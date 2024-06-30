import java.sql.SQLOutput;
import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a=0;
        int b=1;
        int n=in.nextInt();
        for(int i=2;i<=n;i++){
            int s=b;
            b=b+a;
            a=s;

        }
        System.out.println(a);
    }
}
