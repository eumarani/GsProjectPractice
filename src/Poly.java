

// Polymorphism example
public class Poly {

    public static void main(String[] args) {
        // Creating objects of Animal and Dog
        Animal a = new Animal();  // Animal reference and object
        a.sound();  // Will call Animal's sound()

        Animal b = new Dog();  // Animal reference but Dog object
        b.sound();  // Will call Dog's sound() due to polymorphism

        Dog d = new Dog();  // Dog reference and object
        d.sound();  // Will call Dog's sound()
    }

}

// Base class Animal
class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

// Subclass Dog that overrides the sound() method
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}
