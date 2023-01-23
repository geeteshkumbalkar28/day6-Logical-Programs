/*3. primeFactor
Just like the Perfect number, the Prime number is also a special type of number. When
the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
number. 0 and 1 are not counted as prime numbers. All the even numbers can be
divided by 2, so 2 is the only even prime minister.
*/

import java.util.*;

public class primeFactor
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int firstNumber = scan.nextInt();
		
		for(int counter = 2;counter<=firstNumber;counter++)
		{
			while(firstNumber%counter ==0)
			{
				System.out.println(counter);
				firstNumber = firstNumber/counter;
			}
		
		}
		if(firstNumber>2)
		{
			System.out.println(firstNumber);
		}
		
		
	}
}