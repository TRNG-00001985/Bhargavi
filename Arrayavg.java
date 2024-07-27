package revature;

public class Arrayavg 
{
	void meth1() {
		int sum =0; int count =0;
		System.out.println("Array average");
			int arr[] = {1,2,3};
			for(int i:arr) 
			{
				sum+=i;
			}
		System.out.println("array sum:"+sum);
		count =arr.length;
		System.out.println("average:"+ sum/count);
	}
	public static void main(String []args) {
		Arrayavg obj = new Arrayavg();
		obj.meth1();
}
}