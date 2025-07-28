package interview.questions;

public class MissingNumberInArray {


	public static void main(String[] args) {


		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,17};
		
		int N = 17 ; // maximum no 
		
		int missing = findmissingNo(arr,N);
		
		System.out.println("The missing number is :" + missing);

	}
	
	
	private static int findmissingNo(int[] arr, int N) {
		
		int totalExpectedSum= N * (N+1) /2;
		
		int arrSum= 0;
		
		for(int sum:arr)
		{
			arrSum=arrSum+sum;
		}
		
		return totalExpectedSum - arrSum ;
	}

}
