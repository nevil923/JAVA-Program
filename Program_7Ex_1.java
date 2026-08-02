//7.1

import java.util.Scanner;

public class Program_7Ex_1 {

    public static void main(String[] args)
	{
		    Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter the rupees:");
			int rupees=scn.nextInt();
        
        if (rupees >= 200) 
		{
            System.out.println("you have enough money");
        }
    }
}