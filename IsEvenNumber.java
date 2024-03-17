import java.util.Scanner;

public class IsEvenNumber
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number:");
		int a = in.nextInt();
		boolean Is_Even = Even(+a);
		System.out.println("This is even number:" +Is_Even);
	}


		public static boolean Even(int a)
		{
			if(a%2==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	
}