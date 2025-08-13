package Aug12;
//Create a Java program that takes a character representing a grade ('A', 'B', 'C', 'D', 'F') and prints a message indicating the performance (e.g., 'A' for "Excellent", 'F' for "Fail").
import java.util.*;
public class switchcase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        switch(grade){
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("good");
                break;
            case 'C':
                System.out.println("avg");
                break;
            case 'D':
                System.out.println("below avg");
                break;
            case 'F':
                System.out.println("fail");
                break;
        }



    }
    
}
