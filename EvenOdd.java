import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        String ans=evenodd();
        System.out.println(ans);
    }
    static String evenodd(){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if(a%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
}
