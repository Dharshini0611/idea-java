import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a= in.nextInt();
        if(a%3==0 && a%5==0){
            System.out.println("it is divisible by 3 and 5");
        }
        else{
            System.out.println("it is not divisible by 3 and 5");
        }
    }
}
