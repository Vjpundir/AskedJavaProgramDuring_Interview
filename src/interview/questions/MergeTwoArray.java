package interview.questions;

public class MergeTwoArray {

	public static void main(String[] args) {

 
		
		int[] arr1 = {12,78,23};
		int[] arr2 = {34,89,10};
		
		int[] merge = new int[arr1.length + arr2.length];
		
		
		for(int i=0; i< arr1.length;i++)
		{
			merge[i]= arr1[i];
			
//			System.out.print(merge[i] + " ");
		}
		
		
		for(int i=0; i< arr2.length;i++)
		{
			merge[arr1.length +i]= arr2[i]; // 2	
					
	}
 
		
	   System.out.println("merged Array");
	   
	   for(int value:merge)
	   {
		   System.out.print(value + " ");
	   }
}
}
