package interview.questions;

public class MaxAndMinfromArray {

	public static void main(String[] args) {

		int[] array = { 0, 450, 34, 12, 11, 101, 89, 69 };

		int min = array[0];
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}

			if (array[i] > max) {
				max = array[i];
			}

		}

		System.out.println(min);
		System.out.println(max);

	}

}
