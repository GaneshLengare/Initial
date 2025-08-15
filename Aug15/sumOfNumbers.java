package Aug15;
//While Loop: Create a program that calculates the sum of numbers from 1 to 100 using a while loop.

public class sumOfNumbers {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while(num <= 100){
            sum = sum + num;;
            num++;
        }
        System.out.println("Sum from 1 to 100 is :"+sum);
    }
    
}
