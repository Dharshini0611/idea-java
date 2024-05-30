import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        String ans=age();
        System.out.println(ans);
    }
    static String age(){
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        if(a>=18){
            return "eligible";

        }
        else{
            return "not eligible";
        }
    }
}
