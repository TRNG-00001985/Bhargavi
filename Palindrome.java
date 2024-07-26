package revature;



public class Palindrome {
	void meth1(String s)
	{
		String rev="";
		char ch;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			rev=ch+rev;
			
		}
		if(s.equals(rev))
		{
			System.out.println("its a palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
	public static void main(String[] args) {
		new Palindrome().meth1("nitin");
}
}