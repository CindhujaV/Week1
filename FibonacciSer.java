package wk1.dy1;

public class FibonacciSer 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8;
		int FstNum=0;
		int SndNum=1;
		System.out.println("FB Series of"+range+"numbers:");
		for(int i=1; i<=range;++i)
		{
			System.out.print(FstNum+",");
			int sum = FstNum+SndNum;
			FstNum=SndNum;
			SndNum=sum;
		}
		
	}

}
