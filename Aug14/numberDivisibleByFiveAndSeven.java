package Aug14;
//Write a program that prints numbers from 1 to 100. If a number is divisible by both 5 and 7, use continue to skip printing it.

import java.util.Scanner;

public class numberDivisibleByFiveAndSeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            if(i % 5 == 0 && i % 7 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
