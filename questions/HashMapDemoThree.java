package interview.questions;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemoThree {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "vijay");
		map.put(1, "sandy");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.print(entry.getValue());
		}

	}

}
