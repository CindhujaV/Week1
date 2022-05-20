package wk1;
import java.util.Arrays;

public class MissingElementArray {

	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
			
	 int[] array= {2,3,4,5,2,6,7};
			
	 int length = array.length;
	 System.out.println("Length of Array -> " +length); 			// length of Array
	 System.out.println("Last number in Array -> "+array[length-1]);	// last number in array
	 System.out.println("First item in Array -> "+array[0]); 		//to get the First/any item
			
	 Arrays.sort(array); 		//sorting Arrays	
	 int i;
	 System.out.println("Sorted Array Below");
		for(i=0;i<array.length;i++)
			{
				if(i!=array[i+1])								//Missing Element in Array
				System.out.println(array[i]);
			}

	}
}
