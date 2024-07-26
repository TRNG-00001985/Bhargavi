package revature;

public class Octatohexa 
{
	void meth1(int a)
	{
		if((a%3==0)&(a%5==0))
		{
			System.out.println("fizzbuzz");
		}
		else
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		Octatohexa obj= new Octatohexa();
		obj.meth1(3);
	}
}
