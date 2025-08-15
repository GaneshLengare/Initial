package Aug15;
//Do-While Loop: Develop a program that repeatedly asks the user if they want to continue (Y/N). The loop should continue as long as the user enters 'Y' or 'y'.

import java.util.*;

public class continueYesOrNO {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
    }
    
}
