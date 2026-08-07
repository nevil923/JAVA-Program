

class animal{
void eat(){
	System.out.println("this animal eats food.");
}
}



class dog extends animal {
	void bark() {
		System.out.println("the dog barks: woof! woof!");
	}
}

class cat extends animal {
	void mewo() {
		System.out.println("the cat Criynig: mewo! mewo!");
}
}


public class Program13 {
	public static void main(String[] args) {
		dog d = new dog();
		cat c = new cat();
		d.eat();
		d.bark();
		c.eat();
		c.mewo();
	}
}