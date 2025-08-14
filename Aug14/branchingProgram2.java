package Aug14;
//Create a program that iterates from 1 to 20. Use a continue statement to skip printing numbers that are divisible by 3.
public class branchingProgram2 {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 20; i++) {
            if(i % 3 == 0)
                continue;
            System.out.println(i);
            
        }
    }
    
}
