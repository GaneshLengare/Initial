package Aug14;
//Develop a Java program that searches for a specific number in an array. Use a break statement to exit the loop once the number is found.Int[] arr = { 1,2,3,4,5,6,7,8,9,10}   num = 5

public class findNumInArray {
	public static void main(String[] args) {

		int[] arr = { 1,2,3,4,5,6,7,8,9,10};

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if(arr[i]==5)
			    break;
		
		}
	}
    
}
