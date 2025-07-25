package interview.questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapNonRepeating {

	public static void main(String[] args) {

		String str = "swiss";

		Character result = norepeatingChar(str);

		if (result != null)

		{
			System.out.println("first non repeating character :" + result);
		}

		else {
			System.out.println("no non repeating char:" + result);
		}

	}

	static Character norepeatingChar(String str) {

		LinkedHashMap<Character, Integer> charcount = new LinkedHashMap<Character, Integer>();

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
