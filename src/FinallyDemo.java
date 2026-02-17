import java.util.Scanner;

public class FinallyDemo {

    public static void main(String[] args) {
        // Read a and b
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // try block
        try {
            int res = a / b;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            //finally block
            System.out.print("Finally block executed");
        }
    }
}
