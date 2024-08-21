// Superclass
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Inherited method
        myDog.bark(); // Subclass method
    }
}
