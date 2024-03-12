public class String_To_Primitive
{
	public static void main(String[] args)
	{
		String StrInt = "5";
		String Strfloat = "5.5";
		String StrDouble = "6.78";
		String StrBool = "true";

		int MyInt = Integer.parseInt(StrInt);
		float MyFloat = Float.parseFloat(Strfloat);
		double MyDouble = Double.parseDouble(StrDouble);
		boolean MyBool = Boolean.parseBoolean(StrBool);

		System.out.println(StrInt);
		System.out.println(Strfloat);
		System.out.println(StrDouble);
		System.out.println(StrBool);


		System.out.println(MyInt);
		System.out.println(MyFloat);
		System.out.println(MyDouble);
		System.out.println(MyBool);

	}
}