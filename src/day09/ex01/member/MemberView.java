package day09.ex01.member;

import day09.ex01.Gender;
import day09.ex01.library.LibraryRepository;
import util.SimpleInput;

import static java.lang.Integer.parseInt;

/*
 * 역할: 회원 데이터 관리를 위한 입출력
 * */
public class MemberView {
	private static MemberRepository mr;

	static {
		mr = new MemberRepository();
	}

	public static void showSignUpMenu() {
		System.out.println("회원 등록 정보를 입력해주세요.");
		String name = SimpleInput.input("# 이름 : ");
		String password = SimpleInput.input("- 패스워드: ");
		int age = inputAge();
		Gender g = inputGender();
		MemberRepository.addNewMember(new BookUser(name, password, age, g, 0));
		System.out.println("회원등록완료!\n");
	}


	public static void showSignIn() {
		System.out.println("\n로그인을 해주세요!");
		String name = SimpleInput.input("- 이름 : ");
		String password = SimpleInput.input("- 비밀번호 : ");
		BookUser found = MemberRepository.selectMember(name);
		if (found != null && found.getPassword().equals(password)) {
			LibraryRepository.setUser(found);
		} else {
			System.out.println("아이디 또는 비밀번호를 확인해주세요!");
		}
	}

	public static void signOut() {
		LibraryRepository.setUser(null);
		System.out.println("\n로그아웃되었습니다.");
	}

	public static String showMyPage() {
		System.out.println(LibraryRepository.getUser());
		System.out.println("* 1. 대여중인 책 정보\n" +
				"* 2. 대여 기록 조회\n" +
				"* 3. 메뉴 나가기\n");
		return SimpleInput.input("- 메뉴를 선택해주세요.");
	}

	public void showMembers() {
		System.out.printf("======= 현재 회원 목록 (총 %d명) ======== \n", mr.members.length);
		for (BookUser m : mr.members) {
			System.out.println("m = " + m);
		}
	}

	public void inputMember() {
		String email = null;
		while (true) {
			email = SimpleInput.input("- 이메일: ");
			if (!mr.isDuplicateEmail(email)) break;
			System.out.println("중복된 이메일 입니다. \n다시 입력해주세요.");
		}
		String name = SimpleInput.input("- 이름: ");
		String password = SimpleInput.input("- 패스워드: ");
		String gender = SimpleInput.input("- 성별[M/F]: ");
		int age = parseInt(SimpleInput.input("- 나이: "));
//        mr.addNewMember(new BookUser(email, password, name, gender, age));
		System.out.println("회원 가입 성공 !!");
	}

	public static String showProgramMenu() {
		System.out.println("\n##### 도서관 회원 모집 #####");
		System.out.println("* 1. 회원 로그인");
		System.out.println("* 2. 회원 등록");
		System.out.println("* 9. 프로그램 종료");

//        System.out.println("* 2. 개별회원 정보 조회하기");
//        System.out.println("* 3. 전체회원 정보 조회하기");
//        System.out.println("* 4. 회원 정보 수정하기");
//        if (mr.members.length != 0)   {
//            System.out.println("* 5. 회원 정보 삭제하기");
//        }
//        System.out.println("* 6. 회원 정보 복구하기");
//        System.out.println("* 7. 프로그램 종료");
//        System.out.println("============================");
		String menuNumber = SimpleInput.input(" - 메뉴 번호 입력 ");
		return menuNumber;
	}

	public boolean exitProgram() {
		System.out.println("프로그램 종료");
		String exit = SimpleInput.input("- 프로그램을 종료할까요? [y/n]\n>> ");
		if (exit.equals("y")) {
			System.out.println("프로그램을 종료합니다.");
			return true;
		} else {
			System.out.println("프로그램을 종료를 취소합니다.");
			return false;
		}
	}

	public static void wrongMenuNumber() {
		System.out.println("메뉴 번호를 확인해주세요.");
	}

	/**
	 * @method continueProgram
	 * @author hoho
	 * @date 2024 04 16 12:36
	 */
	public void continueProgram() {
		String enter = SimpleInput.input("======== 엔터를 눌러서 계속 =======");
		return;
	}

	public void showMemberByEmail() {

		String email = SimpleInput.input("조회를 시작합니다. \n이메일: ");
		BookUser find = mr.selectMember(email);
		if (find != null) {
			System.out.println("========조회결과========");
			System.out.println("# 이름: " + find.getName());
			System.out.println("# 비밀번호: " + find.getPassword());
			System.out.println("# 성별: " + find.getGender());
			System.out.println("# 나이: " + find.getAge());
			System.out.println();
		} else {
			System.out.println("존재하지 않는 회원입니다.!");
		}
	}

	/**
	 * @method deleteMemberByEmail
	 * @author hoho
	 * @date 2024 04 16 14:15
	 * @detail 삭제할
	 */
	public void deleteMemberByEmail() {
		String email = SimpleInput.input("삭제할 멤버의 이메일을 입력하세요. \n이메일: ");
		BookUser find = mr.selectMember(email);
		if (find != null) {
			System.out.printf("%s님의 ", find.getName());
			String isCheck = SimpleInput.input("비밀번호를 입력해주세요: ");
			if (isCheck.equals(find.getPassword())) {
				mr.deleteMember(find.getName());
				mr.addRestoreMember(find);
				System.out.println("회원이 삭제되었습니다.!");
			} else {
				System.out.println("취소하셨습니다.");
			}
		} else {
			System.out.println("존재하지 않는 회원입니다.!");
		}
	}

	public void updatePassword() {
		String email = SimpleInput.input("수정할 멤버의 이메일을 입력하세요. \n이메일: ");
		BookUser found = mr.selectMember(email);
		if (found == null) {
			System.out.println("존재하지 않는 회원입니다.!");
		}
		while (found != null) {
			System.out.printf("# %s님의 비밀번호를 변경합니다.", found.getName());
			String newPassword = SimpleInput.input("# 새 비밀번호: ");
			if (newPassword.equals(found.getName())) {
				System.out.println("이전 비번과 같습니다. 다시 변경해주세요");
			} else {
//                found.setPassword(newPassword);
				break;
			}
		}
	}

	public void restoreMember() {
		String email = SimpleInput.input("복구할 멤버의 이메일을 입력하세요. \n이메일: ");
		BookUser found = mr.findRestoreMemberByEmail(email);
		if (found != null) {
			String password = SimpleInput.input("비밀번호를 입력하세요. \n비밀번호: ");
			if (found.getPassword().equals(password)) {
				mr.deleteRestoreMember(found);
				mr.addNewMember(found);
				System.out.println("복구되었습니다.");
			} else {
				System.out.println("비밀번호를 확인해주세요.");
			}
		} else {
			System.out.println("존재하지 않습니다.!");
		}
	}

	private static int inputAge() {
		while (true) {
			String age = SimpleInput.input("# 나이 : ");
			if (age.chars().allMatch(Character::isDigit)) {
				return Integer.parseInt(age);
			}
			System.out.println("입력값이 숫자인지 확인해주세요.");
		}
	}

	private static Gender inputGender() {
		while (true) {
			String gender = SimpleInput.input("# 성별(M/F) : ").toUpperCase();
			if (gender.startsWith("M")) {
				return Gender.MALE;
			} else if (gender.startsWith("F")) {
				return Gender.FEMALE;
			} else {
				System.out.println("성별을 잘못 입력했습니다.");
			}
		}
	}
}
