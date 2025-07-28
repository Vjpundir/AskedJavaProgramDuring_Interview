package interview.questions;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		
		int [] arr = {21,34 ,99,56,65};
		
//		System.out.println(Arrays.toString(arr));
//	    Arrays.sort(arr);
//	    System.out.println(Arrays.toString(arr));
	    
	    
	    for(int i =arr.length-1; i>=0;i--)
	    {
	    	System.out.print(arr[i] + " ");
	    }
				
	}

}
