package Aug12;

import java.util.Scanner;

public class votingAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Eligible for vote");
        }else if(age <= 0){
            System.out.println("Invalid Input");
        }else{
            System.out.println("Not eligible for vote");
        }
    }
    
}
