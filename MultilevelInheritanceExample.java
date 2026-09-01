// Base class
class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}

// Derived class (inherits Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dogs can bark");
    }
}

// Derived class (inherits Dog)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppies can weep");
    }
}

// Main class
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        // Access methods from all classes
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // from Puppy
    }
}