package revature;

public class Pyramid 
{
	void meth1() {
		System.out.println("pyramid");
		int rows =15;
		for (int i=1; i<=rows; i++)
		{
			for(int j=i;j<rows;j++) {
				System.out.print(" ");
			}
		
		for (int k=1; k<=(2*i-1);k++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
	}
	public static void main(String args[]) {
		Pyramid obj = new Pyramid();
		obj.meth1();
	}
}
