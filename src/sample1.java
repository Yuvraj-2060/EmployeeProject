import java.util.Scanner;

public class sample1 {
    public static void main(String[] args) {
        final String uname="yuvraj2060";
        final String password="12345678";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Name:");
        String username = sc.next();

        System.out.println("Enter User Password:");
        String passw = sc.next();

        if(uname.equals(username) && password.equals(passw))
            System.out.println("Congratualtion. You have successfuly logedIn");
        else
            System.out.println("You password OR Username might be incorrect..!");

    }
}
