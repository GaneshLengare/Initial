package Aug12;
//Create a Java program that takes an operator (+, -, *, /) and two numbers as input, then performs the corresponding arithmetic operation.
import java.util.*;
public class arithmaticOpration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        char opr = sc.next().charAt(0);

        switch (opr) {
            case '+':
               System.out.println(num1+num2);
                
                break;
          case '-':
                System.out.println(num1+num2);

                break;
            case '*':
                System.out.println(num1*num2);
                
                break;
            case '/':
                System.out.println(num1/num2);
                
                break;
            default:
                throw new AssertionError();
        }

    }
    
}
