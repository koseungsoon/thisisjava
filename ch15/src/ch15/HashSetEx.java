package ch15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		//집함(set) 순서X,중복X
		Set<String> hashSet=new HashSet<String>();
		
		hashSet.add("hi");
		hashSet.add("hi");
		hashSet.add("hi2");
		hashSet.add("hi3");
		
//		hashSet.clear();
//		hashSet.remove("hi2");
		hashSet.add("hi4");
		
		System.out.println(hashSet.size());  //중복 제거해줌
		
		//가져오는 방법1
		for(String str:hashSet) {
			System.out.println(str);
		}
	
		System.out.println("---------");
		//가져오는 방법2(Iterator로 만들어서 가져오기)
		Iterator<String> iterator=hashSet.iterator();
		
//		System.out.println(iterator);
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
			
		}

	}

}
