import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        char ans= mid();
        System.out.println("middle number "+ans);


    }
    static char mid(){
        Scanner in=new Scanner(System.in);
        String  a= in.nextLine();
        int b=a.length();
        int middle= b/2;
        char c= a.charAt(middle);
        return c;






    }
}
