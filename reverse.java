import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int a=n;
        int count=0;
        while (n>0){
            int rem=n%10;//last digit
            n=n/10;// to remove the last digit
            count=(count*10)+rem;//eg 6*10+5=65

        }
        if(a==count){
            System.out.println("palindrome"+count);
        }else{
            System.out.println("not a palindrome"+count);
        }
    }
}
