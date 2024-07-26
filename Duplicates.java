package revature;

public class Duplicates 
{
	void meth1() {
		String s = "funny";
		System.out.println("Contains Duplicates");
		for (int i =1; i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(i==j)
					System.out.println(j);
			}
		}
	}
	public static void main(String args[]) {
		Duplicates obj = new Duplicates();
		obj.meth1();
	}
}
