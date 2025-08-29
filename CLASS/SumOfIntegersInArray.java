
import java.util.Scanner;

public class SumOfIntegersInArray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the array size :");
         int n = sc.nextInt();

         int Arr[] = new int[n];
         System.out.println(Arr.length);
         int sum = 0;

         for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextInt();
            sum+=Arr[i];
         }
         System.err.println(sum);
    }
}
