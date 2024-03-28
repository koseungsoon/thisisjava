package ch15;

import java.util.ArrayList;
import java.util.List;

public class ArrayAndArrayList {

	public static void main(String[] args) {


//		int arrs[] = {23,10,48,15};
		
//		
//		for(int i=0;i<arrs.length;i++) {
//			System.out.println(arrs[i]);
//			
//		}
		
		// 배열을 극복하기 이ㅜ한 자료 구조로 리스트(List) - ArrayList를 사용해보자
		

//		List<Integer> list=new ArrayList<Integer>();
		List list=new ArrayList();
		System.out.println(list);
		boolean result=list.add(23);
		System.out.println("=========");
		System.out.println(result);
		System.out.println(list);
		list.add(10);
		list.add(23);
		System.out.println(list);
		list.add(15);
		list.add("hi");
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		
		List list1=new ArrayList();
		list1.add("###");
		list1.add(list);
		System.out.println(list1);
		System.out.println(list1.size());
		
	}

}
