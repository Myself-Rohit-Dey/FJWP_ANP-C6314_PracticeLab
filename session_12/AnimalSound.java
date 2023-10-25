package session_12;

class Animal {
    void makeSound() {
        System.out.println("The Animal makes a sound.");
    }
}

//dog class inherits the Animal class
class Dog extends Animal{
	//overriding makeSound() method of the inherited Animal class
	@Override
	void makeSound() {
		System.out.println("The Dog barks");
	}
}

//cat class inherits the Animal class
class Cat extends Animal{
	//overriding makeSound() method of the inherited Animal class
	@Override
	void makeSound() {
		System.out.println("The Cat meows");
	}
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        System.out.print("Animal: ");
        animal.makeSound();
        System.out.print("Dog: ");
        dog.makeSound();
        System.out.print("Cat: ");
        cat.makeSound();
    }
}

/*
Output:

Animal: The Animal makes a sound
Dog: The Dog barks
Cat: The Cat meows

*/
