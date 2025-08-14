package Aug14;
//Write a Java program that prints numbers from 1 to 10. Use a break statement to stop the loop when the number reaches 7.
public class branchingProgram1 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if(i == 7){
                break;
            }
            
        }
    }
    
}
