//2. Perfect Number
import java.util.*;
public class perfectNumber
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		perfectNumber obj = new perfectNumber();
		
		System.out.println("Enter the number : ");
		int num1 = scan.nextInt();
		int iAns =obj.checkPerfect(num1);
		if(iAns == num1)	
		{
			System.out.println(num1+" is Perfect Number");
		}
		else 
		{
			System.out.println(num1+" is not Perfect Number");
		}
	}
	public int checkPerfect(int no)
	{
		int sumFact=0;
		for(int counter=1;counter<=no/2;counter++)
		{
			if(no%counter == 0)
			{
				sumFact = sumFact+counter;
			}
		}
		return sumFact;
		
	}
}