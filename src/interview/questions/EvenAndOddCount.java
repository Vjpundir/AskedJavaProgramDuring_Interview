package interview.questions;

public class EvenAndOddCount {

	public static void main(String[] args) {
		
		int a = 24357;
		
		int event_count =0;
		int odd_count =0;
		
		while(a!=0)
		{
			int digit = a%10;
			if(digit %2==0)
			{
				event_count ++;
			}
			else 
			{
				odd_count++;
			}
			
			a/=10;
		}

		System.out.println("Even no count is +  : " + event_count);
		System.out.println("Odd no count is : " + odd_count);
		
	}

}
