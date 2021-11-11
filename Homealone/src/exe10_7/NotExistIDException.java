/*
 * 존재하지 않는 아이디를 입력했을 경우 낫익시스트아이디익셉션을 발생시키고 잘못된 패스워드를 입력했을 경우 롱패스워드익셉션을 발생시키삼 
 */
package exe10_7;
 

public class NotExistIDException extends Exception{
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
		
	}

}
