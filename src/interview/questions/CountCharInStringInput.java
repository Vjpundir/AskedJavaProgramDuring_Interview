package interview.questions;

import java.util.HashMap;
import java.util.Map;

public class CountCharInStringInput {

	public static void main(String[] args) {


		String str= "Vv	ijjayy";
		
		
		Map<Character, Integer> ch= count(str);
		
		for(Map.Entry<Character, Integer> entry : ch.entrySet())
       {
	
			Character key =entry.getKey();
			Integer value = entry.getValue();
			
			if(entry.getValue()>1) {
			
			System.out.println(key + "==>" + value );
       }
	}

	}
	public static Map<Character,Integer> count(String str) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(Character c:str.toCharArray())
		{
			map.put(c,map.getOrDefault(c, 0) + 1);

		}
		

		return map;
		
	}

}
