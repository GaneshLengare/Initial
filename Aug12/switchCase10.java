package Aug12;
//Develop a program that assigns a category to a product based on its first letter (e.g., 'A' for Apparel, 'E' for Electronics, 'F' for Food).
import java.util.*;
public class switchCase10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the letter A, F or E :");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'A':
                System.out.println("Apparel");
                break;
            case 'E':
                System.out.println("Electronics");
                break;
            case 'F':
                System.out.println("Food");
                break;
            default:
                throw new AssertionError();
        }
    }
}
