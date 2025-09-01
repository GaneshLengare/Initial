
class Shape {
    void Area(){
        System.out.println("Calculation of area ");
    }
    
}
class Triangle extends Shape {
    void Area(int l , int b){
        System.out.println("area :"+l*b);
    }

}
class Equilateral extends Triangle{
    void Area(int l ,int b){
        System.out.println("area :"+l*b);
    }

}
public class Inheritance {
    public static void main(String[] args) {
        System.out.println();
    }
    
}
