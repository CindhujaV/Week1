package wk1.dy1;

public class Calculator {
	//int num1 = 2;
	//int num2 = 3;
	//double data1=21.2;
	//double data2 = 32.2;
	public int add(int num1,int num2)
	{
		int sumresult=num1+num2;
		return sumresult;
		
	}
	public double sub(double data1,double data2)
	{
		double subresult=data1-data2;
		return  subresult;
	}
	public double mul(double data1,double data2)
	{
		double mulresult=data1*data2;
		return  mulresult;
	}
	public int div(int num1,int num2)
	{
		int divresult=num1/num2;
		return  divresult;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc=new Calculator();
		System.out.println("Addition = "+calc.add(1,2));
		System.out.println("Subtraction = "+calc.sub(1.1,2.2));
		System.out.println("Multiplication = "+calc.mul(3.3,4.4));
		System.out.println("Division = "+calc.div(6,2));
	}
		
	}


