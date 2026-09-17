public class TestFinally
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Vivaan opening database connection...");
			int data = 25 / 5;
			System.out.println("Data Calculated.");
		}
		finally
		{
			System.out.println("FINALLY BLOCK: Closing Vivaan's database connection guaranteed!");
		}
	}
}