package revature;

public class Strings 
{
	void meth1()
	{
		String str1 = "Hello";
		String str2 = "World";
		System.out.println(str1+str2);
		String str3 = str1.concat(str2);
		System.out.println(str3);
	}
	public static void main(String[] args) {
		Strings obj = new Strings();
		obj.meth1();
	}
}
