package Aug12;

import java.util.Scanner;

//Create a program that checks the type of a vehicle based on a character input ('c' for car, 'b' for bike, 't' for truck).
public class swithCase8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character :");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'c':
                System.out.println("Car");
                break;
            case 'b':
                System.out.println("bike");
                break;
            case 't':
                System.out.println("truck");
                break;
            default:
                System.out.println("please enter c,b or t");
        }

    }
    
}
