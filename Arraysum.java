package revature;

public class Arraysum 
{
	void meth1() {
		int sum =0;
		System.out.println("Array sum");
			int arr[] = {1,2,3};
			for(int i:arr) 
			{
				sum+=i;
			}
		
		
		System.out.println("array sum:"+sum);
	}
	public static void main(String []args) {
		Arraysum obj = new Arraysum();
		obj.meth1();
	}
}
