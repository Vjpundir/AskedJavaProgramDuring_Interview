package interview.questions;

public class FindDuplicatefFromArray {

	public static void main(String[] args) {

		int[] array1 = { 1,2, 2, 3, 3, 4, 6, 5, 5, 7,8,8 };

		for (int i = 0; i < array1.length; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] == array1[j]) {
					
					System.out.println("Duplicates Element in Array : " + array1[i]);
				}
			}
		}

	}

}
