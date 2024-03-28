package ch8;

class UnsupportedFuctionException extends RuntimeException{
	static final private int ERR_CODE = 100; 
	
	public UnsupportedFuctionException() {
	
	}
	
	public UnsupportedFuctionException(String msg, int err_code) {
		super(msg);
		getMessage();
	}
	
	
	public int getErrorCode() {
		
		return ERR_CODE;
	}
	
	
	@Override
	public String getMessage() {
		
		return super.getMessage();
	}
}

public class Ex8_9 {

	public static void main(String[] args) throws Exception {
		
		throw new UnsupportedFuctionException("지원하지않는 기능 입니다.", 100);
		

	}

}
