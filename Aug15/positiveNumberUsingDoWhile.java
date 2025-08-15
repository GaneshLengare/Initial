package Aug15;
//Do-While Loop: Develop a Java program that prompts the user to enter a positive number. Keep prompting until a positive number is entered, using a do-while loop.

import java.util.*;
public class positiveNumberUsingDoWhile {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
        } while (num <= 0);
        System.out.println(num +" is Positive Number ");
    }
    
}
