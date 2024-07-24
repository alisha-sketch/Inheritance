package Inheritanceee;
class Aanimalss {
    // Method in the base class
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Aanimalss {
    // Method in the derived class
    void bark() {
        System.out.println("The dog barks.");
    }
}
class Cat extends Aanimalss {
    // Method in the derived class
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class Puppyyss {
    public static void main(String[] args) {
        // Creating instances of the derived classes
        Dog myDog = new Dog();
        Cat myCat = new Cat();


	

	}

}
