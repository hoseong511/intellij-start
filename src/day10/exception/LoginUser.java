package day10.exception;

/**
 * packageName    : day10.exception
 * fileName       : LoginUser
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */
public class LoginUser {
	private String account;
	private String password;

	public LoginUser(String account, String password) {
		this.account = account;
		this.password = password;
	}

	public enum LoginStatus {
		SUCCESS, ID_FAIL, PW_FAIL
	}

	public LoginStatus loginValidate(String inputAccount, String inputPassword) throws InvalidLoginInputException{
		// 아이디 일치 여부
		if (!inputAccount.equals(account)) {
			throw new InvalidLoginInputException("계정이 일치하지 않습니다.");
		}

		// 비번 일치 여부
		if (!inputPassword.equals(password)) {
			throw new InvalidLoginInputException("비번이 틀렸습니다.");
		}
		System.out.println("로그인 성공");
		return LoginStatus.SUCCESS;
	}
}
