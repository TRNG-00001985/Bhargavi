package revature;
public class Factorial {
	
		void meth1(int num)
		{
			int res = 1;
			for(int i=1;i<=num;i++)
			{
				res = res*i;
			}
			System.out.println("factorial of " + num +" is " + res);
		}
		public static void main(String[] args)
		{
			new Factorial().meth1(5);
		}	
}
