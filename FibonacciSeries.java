 /*1. Fibonacci Series
Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1). */
import java.util.*;

public class FibonacciSeries
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNumber= scan.nextInt();
		System.out.println("Enter the second number");
		int secondNumber= scan.nextInt();
	
		int sum=0,temp1=0,temp2=0;
		
		for(int counter=1; counter<10;counter++)
		{
			
			if(counter == 1)
			{
				System.out.println(firstNumber);
				System.out.println(secondNumber);
				temp2=secondNumber;
			}
			else
			{
				sum = (temp1+temp2);
				System.out.println(sum);
				temp1=temp2;
				temp2=sum;
			}
		}
	}
}