package sec03.brd01;

import java.util.List;

public class BoardService {
	BoardDAO boardDAO;
	
	public BoardService() {
		boardDAO=new BoardDAO();
		
	}
	
	public List<ArticleVO> listArticles() {
		return boardDAO.selectAllArticles();
	}
	
	public int addArticle(ArticleVO article) {
	
		return 	boardDAO.insertNewArticle(article);	
		
		
	}
	
	public ArticleVO viewArticle(int articleNO) {
		ArticleVO article = null;
		article = boardDAO.selectArticle(articleNO);
		return article;
	}
	
}
