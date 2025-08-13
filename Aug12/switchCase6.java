package Aug12;
// Write a program that simulates a simple menu-driven application. Present options like "1. New Game", "2. Load Game", "3. Exit" and use a switch statement to handle user choices.
import java.util.*;
public class switchCase6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your choice :");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("New Game");
                break;
            case 2:
                System.out.println("Load Game");
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
