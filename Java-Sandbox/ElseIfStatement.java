import java.util.Scanner;

public class ElseIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = 0;
        try {
            age = scan.nextInt();
        } catch (Exception e) {
            System.out.println("U must have entered invalid INPUT!");
            return;
        } finally {
            scan.close();
        }
        if (age >= 100) {
            System.out.println("Not a thing to ask for!");
        } else if (age >= 18) {
            System.out.println("Your are eligible to vote");
        } else {

            System.out.println("Your are Not eligible to vote");
        }
    }
}