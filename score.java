import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        int e=in.nextInt();
        int sum=a+b+c+d+e;
        int avg=sum/5;
        if(sum<35){
            System.out.println("you need extra class");
        }
        else{
            System.out.println("u had got good score");
        }
    }
}
