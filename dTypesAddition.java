import java.util.Scanner;

public class dTypesAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer1:");
        int n1 = sc.nextInt();
        System.out.println("Enter Integer2:");
        int n2 = sc.nextInt();

        int addition = n1+n2;
        System.out.println("Addition is :"+addition);

        System.out.println("Enter Integer no.:");
        int n3 = sc.nextInt();
        System.out.println("Enter Float no.:");
        float n4 = sc.nextFloat();

        float Addition = n3+n4;
        System.out.println("Addition is :"+Addition);
    }
    
}
