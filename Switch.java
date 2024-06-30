import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String my_boy=in.nextLine();
        switch(my_boy){
            case"kanna":
                System.out.println("a polite one ");
                break;
            case"suri":
                System.out.println("cute and handsome one");
                break;
            case"agora":
                System.out.println("anger and revenge one");
                break;
                
            default:
                System.out.println("pls enter the correct nick name ");
        }
    }
}
