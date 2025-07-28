package interview.questions;

import java.util.Arrays;

public class CompareArrayProgram {

	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 4, 5, 6 };

		int[] arr2 = { 1, 3, 4, 5, 6 };

		int[] arr3 = { 4, 6, 2, 4, 7 };

		if (Arrays.equals(arr1, arr2)) {

			System.out.println("Arrays is matched successfully");
		}

		else {
			System.out.println("Array is not matched with other array");
		}

	}

}
