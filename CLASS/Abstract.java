
abstract class Animal {

    abstract void sound();

    abstract void run();

    void eat() {
        System.out.println("Eating");
    }

}

class Dog extends Animal {    //the dog class is extended from the abstract class which is Animal. we have implement all abstract methods in Dog class from Animal class.
                              //for e.g sound() and run() are abstract in Animal -> implemented in Dog class.

    void sound(){
        System.out.println("Bark");
    }
    void run() {
        System.out.println("Fast");
    }
  
}
public class Abstract {
    public static void main(String[] args) {

        Dog obj = new Dog();
        obj.sound();
        obj.eat();
        obj.run();
        
    }
    
}
