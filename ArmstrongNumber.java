package wk1.dy1;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=153;
		int sum=0;
		int input = num1;
		int output = 0;
		while (num1 > 0)
		{
			int rem = num1%10;
			sum=sum+(rem*rem*rem);
			num1=num1/10;
		}
			System.out.println("Armstrong Number="+sum);
			if (input == output){
				System.out.println("Armstrong Number");
			}
				else{
					System.out.println("Not Armstrong Number");
				}
	
	}
}


