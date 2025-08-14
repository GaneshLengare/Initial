import java.util.*;
public class dataTypes {
    public static void main(String[] args){
        int a=18;
        double b=7.8;
        char c='G';
        String str="ganesh";
        System.out.println("Hardcoded values are:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(str);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer value:");
        int A = sc.nextInt();
        System.out.println("Enter Double value:");
        double B = sc.nextDouble();
        System.out.println("Enter character value:");
        char C = sc.next().charAt(0);
        System.out.println("Enter String value:");
        String D = sc.next();
        System.out.println("Input Values:");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);

    }

}
