import java.util.Scanner;

public class SwitchCase
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Day first 3 letters(in small):");
		String Day = in.next();
		String WorkTime ="";
		switch(Day)
		{
			case "mon":
			WorkTime="8am-6pm";
			break;

			case "tue":
			WorkTime="8am-6pm";
			break;

			case "wed":
			WorkTime = "8am-6pm";
			break;

			case "thu":
			WorkTime = "8am-6pm";
			break;

			case "fri":
			WorkTime = "8am-4pm";
			break;

			case "sat":
			WorkTime="8am-12pm";
			break;

			case "sun":
			WorkTime = "Leave day";
			break;

			default:
			System.out.println("Please enter valid value");
			break;

		}
		System.out.println("Today worktime is :" +WorkTime);
	}
}