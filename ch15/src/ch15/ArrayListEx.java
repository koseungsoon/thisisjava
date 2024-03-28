package ch15;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		//저장할 공간, 리스트 (ArrayList)
		
		
//		ArrayList<Board> arrList=new ArrayList<Board>();
//		
//		arrList.add(new Board("제목1","내용1","글쓴이1"));
//		arrList.add(new Board("제목2","내용2","글쓴이2"));
//		
////		System.out.println(arrList);
//		
//		for(Board boardList : arrList) {
//			System.out.println(boardList.getContent()+boardList.getSubject()+boardList.getWriter());
//		}
		
		ArrayList<Board> arrList=new ArrayList<Board>();
		
		arrList.add(new Board("제목","내용","글쓴이"));
		arrList.add(new Board("제목2","내용2","글쓴이2"));
		
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i).getContent());
		}
		
		
		
		
		

	}

}
