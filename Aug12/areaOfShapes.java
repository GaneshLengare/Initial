package Aug12;
/*Write a program that calculates the area of different shapes. 
Ask the user to choose a shape (e.g., 'c' for circle, 's' for square, 't' for triangle) 
and then prompt for the necessary dimensions. Use a switch statement to handle the shape selection.*/

import java.util.*;
public class areaOfShapes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 'c' for circle,'s' for square,'t' for the triangle :");
        char shape = sc.next().charAt(0);

        switch (shape) {
            case 'c':
                System.out.print("enter the radius :");
                int radius = sc.nextInt();
                System.out.println(3.14*radius*radius);
                break;
            case 's':
                System.out.print("enter the side :");
                int side = sc.nextInt();
                System.out.print(side*side);
                break;
            case 't':
                System.out.print("enter the height :");
                int height = sc.nextInt();
                System.out.print("enter the breadth :");
                int breadth = sc.nextInt();                
                System.out.println(height*breadth);
                break;
        
            default:
                break;
        }




    }
    
}
