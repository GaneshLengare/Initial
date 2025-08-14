package Aug14;
//Create a program that prints all even numbers between 1 and 50, but stops if the number is greater than 30.

import java.util.*;

public class evenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 50; i++) {
            if(i % 2 == 0){
                if(i > 30){
                    break;
                }
                System.out.println(i);
            }
        }
    }
    
}
