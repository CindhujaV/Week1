package wk1;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inter1= {8,7,6,5,4,3};
		int[] inter2= {1,2,3,4,5,6};
		
		System.out.println("Intersection of two arrays -> ");
			
		for(int i=0;i<inter1.length;i++)
			{
				for(int j=0;j<inter2.length;j++)
					{
						if(inter1[i]==inter2[j])
							{
								System.out.print(inter1[j]);	//inter2 intersection value
							}
					}

			}
	}
}
