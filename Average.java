import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
int ans=average();
        System.out.println(ans);
    }
    static int average(){
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int ave=((a+b+c)/3);
        return ave;
    }
}