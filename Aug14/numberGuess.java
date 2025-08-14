package Aug14;
//Develop a Java program that simulates a game where the user keeps guessing a number until they guess correctly. Use a break statement to end the game.

import java.util.*;

public class numberGuess {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; ; i++) {
            System.out.println("Enter number :");
            int num = sc.nextInt();
            System.out.println(num);
            if(num == 12){
                break;
            }
        }
    }
}
