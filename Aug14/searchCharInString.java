package Aug14;
//Create a program that finds the first occurrence of a character 'x' in a given string and then stops searching.

import java.util.*;

public class searchCharInString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);;

        System.out.print("Enter the String :");
        String S = sc.next();

        for (int i = 0; i < S.length(); i++) {
            System.out.println(S.charAt(i));
            if(S.charAt(i) == 'x'){
                System.out.println("character x is occured in String");
                break;
            }
        }
    }
}
