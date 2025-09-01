import java.util.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // Declare the variable
        int a;
        
        // Read the variable from STDIN
        a = in.nextInt();
        
        for(int i = 0; i < a; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        

   }
}

