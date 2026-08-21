interface Kutta
{
	void SoundKutta();
}

interface Meow extends Kutta
{
	void SoundMeow();
}

interface Catuuu extends Kutta
{
	void SoundCatuu();
	void CatDrinking();
}

class Dog implements Meow
{
	public void SoundKutta()
	{
		System.out.println("Woooowooowoooooof");
	}
	public void SoundMeow()
	{
		System.out.println("Meowwwwwwwwwwwwwww");
	}
	public void SoundCatuu()
	{
		System.out.println("Catuuuuuuuuuuuuuu");
	}
	public void CatDrinking()
	{
		System.out.println("Drinking Milk a Cat");
	}
	
}
	
	public class Program22EX
	{
		public static void main(String[] args)
		{
			Dog c = new Dog();
			c.SoundKutta();
			c.SoundMeow();
			c.SoundCatuu();
		}
	}