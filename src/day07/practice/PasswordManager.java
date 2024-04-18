package day07.practice;

/**
 * packageName    : day07.practice
 * fileName       : PasswordManager
 * author         : hoho
 * date           : 4/17/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 *
 *      . **비밀번호 관리 클래스**
 *     - 사용자의 비밀번호를 관리하는 `PasswordManager` 클래스를 작성하세요.
 *     - 비밀번호(password) 필드는 private으로 선언하고, 비밀번호를 설정하고 변경할 수 있는 메소드를 public으로 만드세요.
 *     - 비밀번호 변경 시 현재 비밀번호를 입력받아야만 변경 가능하도록 구현하세요.
 */
public class PasswordManager {

    private String password;

    /**
     * 비밀번호 설정
     * @param password
     */
    public PasswordManager(String password) {
        this.password = password;
    }

    /**
     * 비밀번호 변경
     * @method   setPassword
     * @param    password
     * @author   hoho
     * @date     2024 04 17 12:31
     *
     */
    public boolean changePassword(String oldPass, String newPass) {
        if (this.password.equals(oldPass)) {
            this.password = newPass;
            System.out.println("비밀번호가 변경 되었습니다.");
            return true;
        } else {
            System.out.println("현재 비밀번호를 확인 해주세요.");
        }
        return false;
    }
}
