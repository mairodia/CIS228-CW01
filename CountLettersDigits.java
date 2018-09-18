//Date: 9/10/2018
//File Name: CounterLettersDigits.java
//Programmer: Jennifer King

import java.util.Scanner;

public class CountLettersDigits {

	public static void main(String[] args) {
	{
		String UserEntry;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a string >> ");
		UserEntry = keyboard.nextLine();
		
		int length = UserEntry.length();
		
		int numChars = 0;
		int numDigits = 0;
		Character temp;
		
		for(int i = 0; i < length; i++)
		{
			temp = UserEntry.charAt(i);
			
			if(Character.isLetter(temp))
			{
				numChars++;
			}
			else if(Character.isDigit(temp))
			{
				numDigits++;
			}
			else
			{
			}
		}
		
		System.out.print("The string has " + numChars + " letters and " + numDigits + " digits.");
	}

}

}
