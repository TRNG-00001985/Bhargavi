package revature;

public class Gcd 
{
	void meth1(int num1,int num2)
	{
		int hcf=0;
		for(int i=1;i<=num1 || i<=num2;i++)
		{
			  if (num1 % i == 0 && num2 % i == 0)
			        hcf = i;
			      }

			    System.out.println("The HCF: "+ hcf);
			  }
		
	
public static void main(String args[]) {
	Gcd obj = new Gcd();
	obj.meth1(10, 20);
}
}
