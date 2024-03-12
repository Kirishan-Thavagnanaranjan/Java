public class Primitive_To_String
{
	public static void main(String[] args)
	{
		int MyInt = 5;
		float MyFloat = 6.7f;
		double MyDouble = 7.88;
		char MyChar = 'A';
		boolean MyBool = true;

		//converting to string


		String str1 = String.valueOf (MyInt);
		String str2 = String.valueOf (MyFloat);
		String str3 = String.valueOf (MyDouble);
		String str4 = String.valueOf (MyChar);
		String str5 = String.valueOf (MyBool);
		
		System.out.println(MyInt);
		System.out.println(MyFloat);
		System.out.println(MyDouble);
		System.out.println(MyChar);
		System.out.println(MyBool);


		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}

}
