package ExceptionalHandling_WileyEdge;

import java.util.Scanner;

public class MultiCatchException2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;

        System.out.println("Enter Both The Number To Perform Operations: ");

        try{
            a = sc.nextInt();
            b = sc.nextInt();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            int sum= a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

        finally {
            System.out.println("Doesn't Matter Whether Any Exception Occur Or Not...!");
        }
    }
}
