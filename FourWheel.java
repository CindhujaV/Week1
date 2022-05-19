package wk1.dy1;

public class FourWheel {

	public void appBreak()
	{
	System.out.println("Apply Break");
	}
	public void appGear()
	{
		System.out.println("Gear on");
	}
	public void switchAc()
	{
		System.out.println("Air Conditioner On");
	}
	public void appAcclerator()
	{
		System.out.println("Press Accelerator");
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		FourWheel wheel=new FourWheel();
		wheel.appBreak();
		wheel.appGear();
		wheel.switchAc();
		wheel.appAcclerator();

	}

}
