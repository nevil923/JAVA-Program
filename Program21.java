interface Animal
{
	void makeSound();
	void eat();
}

class Dog implements Animal
{
	public void makeSound()
	{
		System.out.println("woof woof woooooooooooooof!");
	}
	public void eat()
	{
		System.out.println("Dog is eating dog food.");
	}
}
class Cat implements Animal
{
	public void makeSound()
	{
		System.out.println("Meowwwwwwwwwwwwowowowwo!");
	}
	public void eat()
	{
		System.out.println("Meow is eating a Fish.");
	}
}

public class Program21
{
	public static void main(String[] args)
	{
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		System.out.println("Dog:");
		dog.makeSound();
		dog.eat();
		
		System.out.println("\nCat:");
		cat.makeSound();
		cat.eat();
	}
}