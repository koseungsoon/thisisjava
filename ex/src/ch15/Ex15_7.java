package ch15;

import java.util.List;

public class Ex15_7 {

	public static void main(String[] args) {


		BoardDao dao=new BoardDao();
		List<Board> list = dao.getBoardList();
		
		for(Board board:list ) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}
		
	}

}
