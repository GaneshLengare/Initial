package Aug15;
//For Loop: Write a program that prints the multiplication table for a given number (e.g., 5 * 1 = 5, 5 * 2 = 10, ... up to 10).

import java.util.*;

public class tableOfAnyNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to print table of that number :");
        int num = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num*i);
            
        }
    }
    
}
