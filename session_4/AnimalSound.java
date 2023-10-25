package session_4;

class Animal{
	void makeSound() {
		System.out.println("The Animal makes a sound");
	}
}
//dog class inherits the animal class
class Dog extends Animal{
	//overriding makeSound() method of the inherited Animal class
	@Override
	void makeSound() {
		System.out.println("The Dog barks");
	}
}
//cat class inherits the animal class
class Cat extends Animal{
	//overriding makeSound() method of the inherited Animal class
	@Override
	void makeSound() {
		System.out.println("The Cat meows");
	}
}

public class AnimalSound {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		System.out.print("Animal: ");
		a1.makeSound();
		Dog d1 = new Dog();
		System.out.print("Dog: ");
		d1.makeSound();
		System.out.print("Cat: ");
		Cat c1 = new Cat();
		c1.makeSound();	
	}
}

/*
Output:

Animal: The Animal makes a sound
Dog: The Dog barks
Cat: The Cat meows
*/



