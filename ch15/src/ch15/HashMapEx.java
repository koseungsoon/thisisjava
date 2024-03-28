package ch15;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		
		HashMap<String, String> hashMaps=new HashMap<String,String>();
		
		hashMaps.put("a", "apple");
		hashMaps.put("b", "banana");
		hashMaps.put("c", "carrot");
		
		System.out.println(hashMaps.get("a"));
		
		//전체를 다 가져오고자 할 경우, 키가 중요하므로 키만 뽑을수 있는지
		
		Set<String> keySets=hashMaps.keySet();
		
		System.out.println(hashMaps.keySet());
		
		for(String key : keySets) {
//			System.out.println(key);
			System.out.println(key + " : "+ hashMaps.get(key));
			
		}
		
		

	}

}
