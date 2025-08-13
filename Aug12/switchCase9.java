package Aug12;

import java.util.Scanner;

//Write a program that takes a user's choice of currency conversion (e.g., 'U' for USD to EUR, 'E' for EUR to USD) and performs the conversion based on a fixed exchange rate.
public class switchCase9 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter character U or E :");
    char currency = sc.next().charAt(0);

    switch (currency) {
        case 'U':
            System.out.println("USD to EUR");
            break;
        case 'E':
            System.out.println("EUR to USD");
            break;
        default:
            throw new AssertionError();
        }   
    }


}
