public class Operators
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 15;

		//Arithmetic Operators

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(++a);
		System.out.println(--b);


		//Assignment operators


		System.out.println(a+=2);
		System.out.println(a-=4);
		System.out.println(a*=2);
		System.out.println(a/=2);
		System.out.println(a%=3);
		System.out.println(a&=2);
		System.out.println(a|=2);
		System.out.println(a^=2);
		System.out.println(a<<2);
		System.out.println(a>>2);

		//comparison Operators

		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);

		//Logical operators

		System.out.println(a<8 && b>3);
		System.out.println(a>5||b<2);
		System.out.println(!(a>2&&b<7));

		//Bitwise operators

		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(a<<b);
		System.out.println(a>>b);
		System.out.println(a>>>b);
	}
}
