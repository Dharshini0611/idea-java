import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double ans=area();
        System.out.println(ans);
    }
    static double area(){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        double area=3.14*a*a;
        return area;
    }
}

