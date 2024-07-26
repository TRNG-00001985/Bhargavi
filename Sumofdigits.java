package revature;



public class Sumofdigits {
	
			void meth1()
			{
				int num=123, sum=0;
				
				System.out.println("Sum of Digits");
				
				while(num!=0) {
					sum +=num%10;
					num=num/10;
				}
				
					
					System.out.println(sum);
			}
			public static void main(String[] args) {
				Sumofdigits obj=new Sumofdigits();
				obj.meth1();
			}
	
}
