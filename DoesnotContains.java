package revature;

public class DoesnotContains 
{
	public static void main(String[] args) {
		String str = "revature";
		System.out.println(!str.contains("av")); //doesnotcontains
		System.out.println(!str.contains("hi"));
		System.out.println(!str.contains("Re"));
		System.out.println(str.contains("re"));

	}

}
