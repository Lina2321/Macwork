package exe10_7;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("while","12345");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}

		
		try {
			login("blue", "54321");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		
		//id가 "blue"가 아니라면 낫익시스트아이디익스펙션 발생
		if(!id.equals("blue")){
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
			
	}
		
		//password가 "12345"가 아니라면 롱패스워드익셉션 발생
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀렸습니다.");
		}
		}
}
