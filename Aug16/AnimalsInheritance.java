package Aug16;
//Create a base class Animal with a method eat().
//Create two subclasses: Dog (with bark()) and Cat (with meow()).
//Show how both can use the eat() method from Animal.

class Animal {
    void eat(){
        System.out.println("Eating");

    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Barking");

    }

}
class Cat extends Animal {
    void meow(){
        System.out.println("Meow");

    }

}

public class AnimalsInheritance {
    public static void main(String[] args) {
        Animal A = new Animal();
        A.eat();
        Dog D = new Dog();
        D.eat();
        D.bark();
        Cat C = new Cat();
        C.eat();
        C.meow();
    }
    
}
