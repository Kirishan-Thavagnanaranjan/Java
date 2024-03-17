public class ParameterArgumentExample
{
	static void FirstMethod(String Name)
	{
		System.out.println("Hi " +Name +", Welcome to our program");
	}

	public static void main(String[] args)
	{
		FirstMethod("Kirishan");
		FirstMethod("Kirish");
		FirstMethod("Kiri");
	}
}