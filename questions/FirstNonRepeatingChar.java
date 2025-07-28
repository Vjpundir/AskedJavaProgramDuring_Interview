package interview.questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {

		String input = "swiss";

		Character result = nonrepeatingchar(input);

		if (result != null) {
			System.out.println("First non repeating word : " + result);
		}

		else {
			System.out.println("No non repeating word : " + result);
		}

	}

	static Character nonrepeatingchar(String str) {

		LinkedHashMap<Character, Integer> charcount = new LinkedHashMap<>();

		for (char c : str.toCharArray()) {
			if (charcount.containsKey(c)) {
				charcount.put(c, charcount.get(c) + 1);
			}

			else {
				charcount.put(c, 1);
			}

		}

		for (Map.Entry<Character, Integer> entry : charcount.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}

		return null;

	}

}
