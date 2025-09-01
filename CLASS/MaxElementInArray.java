public class MaxElementInArray {
    public static void main(String[] args) {
        int Arr[] = {10, 5, 4, 3, 1, 8, 11};
        int temp = Integer.MIN_VALUE;
        for(int i = 0; i<Arr.length; i++){
            if(Arr[i] > temp ){
                temp = Arr[i];
            }
        }System.out.println(temp);
    }
}
