package Aug14;
//Write a program that prompts the user to enter numbers repeatedly. Use a break statement to exit the loop when the user enters '0'.

import java.util.Scanner;

public class exitWhenZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; ;i++) {
            System.out.print("Enter the number :");
            int num  = sc.nextInt();
            if(num == 0)
                break;
        }
        

    }
    
}
