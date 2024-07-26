package revature;

public class Searching2Darray 
{
	void meth1() {
		int arr[][] = {{1,2,3} ,{4,5,6}};
		System.out.println("Searching 2D Array");
		{
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if(arr[i][j]==7) {
						System.out.println(7);
					}
				}
			}
		}
	}
	public static void main(String args[]) {
		Searching2Darray obj = new Searching2Darray();
		obj.meth1();
	}
}
