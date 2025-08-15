package Aug15;
//While Loop: Create a program that reverses a given integer (e.g., 123 becomes 321).

import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int str = 0;

        while (num != 0) {
            int i = num % 10;   
            str = str * 10 + i; 
            num = num / 10; 
        }

        System.out.println("Reversed number: " + str);

        
    }
    
}
