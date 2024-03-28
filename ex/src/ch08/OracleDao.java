package ch08;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("오라클 디비에서 검색");
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("오라클 디비에 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("오라클 디비를 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("오라클 디비에서 삭제");
	}

}
