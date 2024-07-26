package revature;

public class Leapyear 
{
	void meth1(int a)
	{
		if(a%4==0) {
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
	}
	public static void main(String[] args) {
		Leapyear obj = new Leapyear();
		obj.meth1(2025);
	}
}
