//Reverse a number

import java.util.*;
public class ReverseNumber
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		ReverseNumber obj = new ReverseNumber();
		
		System.out.println("Enter the number : ");
		int num1 = scan.nextInt();
		int iAns =obj.reverseNumber(num1);
		System.out.println("After doing reverse :"+iAns);
	}
	public int reverseNumber(int no)
	{
		int sumNumber=0;
		while(no!=0)
		{
			sumNumber = ((sumNumber*10)+(no%10));
			no = no/10;
		}
		return sumNumber;
	}
}