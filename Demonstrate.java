class Animal {
        public void makeSound() {
            System.out.println("The animal makes a sound.");
        }
    }
    
    // Define the Dog class, which is a subclass of Animal
    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The dog barks.");
        }
    }
    
    // Define the Cat class, which is a subclass of Animal
    class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The cat meows.");
        }
    }
    
    public class Demonstrate {
        public static void main(String[] args) {
            // Create objects of Animal, Dog, and Cat
            Animal animal = new Animal();
            Animal dog = new Dog();
            Animal cat = new Cat();
    
            // Demonstrate method overriding
            System.out.println("Animal sound:");
            animal.makeSound(); 
    
            System.out.println("\nDog sound:");
            dog.makeSound();   
    
            System.out.println("\nCat sound:");
            cat.makeSound();    
        }
    }
    
// OUTPUT

// Animal sound:
// The animal makes a sound.

// Dog sound:
// The dog barks.

// Cat sound:
// The cat meows.
    
