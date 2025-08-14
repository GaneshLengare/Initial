package Aug14;
//Write a program that iterates through a string and prints each character. If the character is a vowel, use continue to skip printing it.

public class skipVowel {
    public static void main(String[] args) {
        
        for (int i = 65; i <= 90; i++) {
            if((char)i=='A' || (char)i == 'E' || (char)i == 'I' || (char)i == 'O' || (char)i == 'U'){
                continue;
            }
            System.out.println((char)i);
        }
    }

    
}
