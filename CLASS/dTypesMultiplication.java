import java.util.Scanner;

public class dTypesMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        double n2 = sc.nextDouble();

        double multi = n1*n2;
        System.out.printf("Multiplication is:%.2f\n",multi);
    }
    
}
