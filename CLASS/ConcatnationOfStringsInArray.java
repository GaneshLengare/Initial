
import java.util.Scanner;

public class ConcatnationOfStringsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();

        String Arr[] = new String[n];
        String s = "";

        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.next();
            s +=Arr[i];

        }
        System.out.println(s);
    }
}
