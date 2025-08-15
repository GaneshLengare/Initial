package Aug15;
//For Loop: Write a Java program that prints the first n terms of the Fibonacci sequence (where n is provided by the user).

import java.util.*;

public class FirstNTermsOfFibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many terms you wants to print from fibonacci series :");
        int n = sc.nextInt();

        int sum = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(sum);
            sum += i;
        }
    }
    
}
