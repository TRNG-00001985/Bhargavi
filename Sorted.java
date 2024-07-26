package revature;

import java.util.Arrays;

public class Sorted 
{
	void meth1() {
		int arr[]= {1,2,3,4};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String args[]) {
		Sorted obj = new Sorted();
		obj.meth1();
}
}