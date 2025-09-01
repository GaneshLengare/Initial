
class Student {

    // String Name;
    // String batch;
    // String Mobile;
    // int passinngYear;


    void displayDetails(String A,String a,String b,int c){
        System.out.println("Name :"+ A);
        System.out.println("Batch :"+a);
        System.out.println("Mobile no. :"+b);
        System.out.println("passingYear :"+c);
    }

    void displayDetails(String A,String a,String b){
        System.out.println("Name :"+ A);
        System.out.println("Batch :"+ a);
        System.out.println("Mobile no. :"+b);
    }
}

public class compileTimePolymorphism {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.displayDetails("Ganesh","B8","+918767714245",2025);

        Student s2 = new Student();
        s1.displayDetails("Shreyash","B8","+918767714245");
        
    }
    
}
