package revature;

public class Exception 
{
	
		  public static void main(String[] args) {

		    try {
		      int i= 5 / 0;
		      System.out.println("try block");
		    }
		    
		    catch (ArithmeticException e) {
		      System.out.println("ArithmeticException " + e.getMessage());
		  }
		}
}
