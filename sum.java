import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;//eliminate the last valuve and give remaning number

        }
        System.out.println("sum of the digit: "+sum);
    }
}
