package revature;

public class Contains 
{
	void meth1() {
	String str = "Revature";
	System.out.println(str.contains("re"));
	System.out.println(str.contains("va"));
	System.out.println(!str.contains("av")); //doesnotcontains
	System.out.println(!str.contains("hi"));
	System.out.println(!str.contains("Re"));
	}

public static void main(String args[]) {
	Contains obj = new Contains();
	obj.meth1();
}
	
	
}
