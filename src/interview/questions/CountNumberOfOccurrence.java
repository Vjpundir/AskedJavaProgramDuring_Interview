package interview.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNumberOfOccurrence {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 2, 2, 1, 4, 3, 4, 4, 6, 4, 7);

		HashMap<Integer, Integer> countMap = new HashMap<>();

		for (Integer num : list) {

			countMap.put(num, countMap.getOrDefault(num, 0) + 1);

		}

		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "==>" + entry.getValue());
			}
		}
	}

}
