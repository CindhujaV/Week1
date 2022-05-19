package wk1.dy1;
import java.util.*;
import java.util.Arrays;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingElementInArray sc=new MissingElementInArray();
		int[] array= {1,3,4,4,2,6,1};
		//find Array
				int length = array.length;
				System.out.println(array[length-1]);
		//to get the First item
				//System.out.println(array[0]);//1
				System.out.println(array[length-1]);//7
		//sorting Arrays
		Arrays.sort(array);
		//System.out.println(array);
		int i;
		int n;
		System.out.println("Total array number");
		
		for(i=0;i<array.length;i++)
		{
			if(i!=array[i+1])//Missing Element in Array
		System.out.println(array[i]);
		}
	int[] inter1= {1,2,3,4,5,5,6};
	int[] inter2= {2,3,4,5,7,8};
	for(int j=0;j<inter1.length;j++)
		for(int j2=0;j2<inter2.length;j++);
	int j2 = 0;
	int j = 0;
	if(inter1[j]==inter2[j2])
	{System.out.println(inter1[j]);
	}
		
		

}
}
