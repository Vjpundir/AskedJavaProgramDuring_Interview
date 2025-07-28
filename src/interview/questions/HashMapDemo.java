package interview.questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		Map<Integer,String> hashMap= new HashMap<>();
		
		hashMap.put(1,"vijay");
		hashMap.put(null, "vijay");
		hashMap.put(2,"shakti");
		hashMap.put(3,"sandy");
		hashMap.put(4,"raj");
		hashMap.put(5,"sidhu");
		hashMap.put(7,"raghuraj");
		hashMap.put(1,"Joe");
		hashMap.put(1,"justin timberlake");
		
		boolean result =hashMap.containsKey(99);
		System.out.println(result);
		
		
		
//		System.out.println(hashMap);
	
	
//		     Iterator<Entry<Integer,String>>it = hashMap.entrySet().iterator();
//		      
//		    	 while(it.hasNext()) {
//		    		 System.out.println(it.next());
//		    	 }
     }
		
	}



