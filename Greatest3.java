package revature;

public class Greatest3 {
void meth1(int num1,int num2,int num3) {
	if((num1>num2)&&(num1>num3)) {
		System.out.println("greatest number is:"+num1);
	}
	else if((num2>num3)&&(num2>num1)) {
		System.out.println("greatest number is:"+num2);
	}
	else {
		System.out.println("greatest number is:"+num3);
	}
}
public static void main(String[] args) {
	Greatest3 obj = new Greatest3();
	obj.meth1(5,6,7);
}
}
