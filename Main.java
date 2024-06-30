
public class Main {
    public static void main(String[] args) {
        int n=13839;
        int count=0;
        while(n>0){
           int rem=n%10;// last digit
           if(rem==3){
               count++;
           }
           n=n/10;}// to remove the last digit
                System.out.println(count);
            }




    }
