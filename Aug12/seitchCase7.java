package Aug12;

import java.util.Scanner;

public class seitchCase7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your choice :");
        int num = sc.nextInt();

        
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid Input");;
        }
    }
    
}
