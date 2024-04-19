package day09.ex01;

import util.SimpleInput;

/**
 * packageName    : day09.ex01
 * fileName       : LibraryView
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
public class LibraryView {

	public static void start() {
		while (true) {
			if (LibraryRepository.getUser() == null) {
				signUpMenu();
				continue;
			}
			if (libraryMenu() == 0) break;
		}
	}

	private static void signUpMenu() {
		System.out.println("회원 정보를 입력해주세요.");
		String name = SimpleInput.input("# 이름 : ");
		int age = inputAge();
		Gender g = inputGender();
		LibraryRepository.setUser(new BookUser(name, age, g, 0));
		System.out.println("회원등록완료!\n");
	}

	private static int libraryMenu() {
		switch (libraryMenuDisplay()) {
			case "1":
				myPage();
				break;
			case "2":
				selectBookList();
				break;
			case "3":
				selectBookByName();
				break;
			case "4":
				rentBook();
				break;
			case "5":
				selectBookByAuthor();
				break;
			case "9":
				System.out.println("프로그램 종료합니다.");
				return 0;
			default:
				System.out.println("올바른 메뉴를 선택해주세요");
				break;
		}
		return 1;
	}

	private static void selectBookList() {
		BookList bookList = LibraryRepository.getBookList();
		System.out.println("\n============ 모든 도서 정보 ===========");
		for (Book book : bookList.getBookList()) {
			System.out.println(book.info());
		}
	}

	private static void selectBookByAuthor() {
		String input = SimpleInput.input("# 검색어 : ");
//		LibraryRepository.
	}

	private static void rentBook() {
		BookList bookList = LibraryRepository.getBookList();
		System.out.println("\n============ 대여 가능한 도서 정보 ===========");
		Book[] list = bookList.getBookList();
		for (int i = 0; i < list.length; i++) {
			Book book = list[i];
			System.out.printf("%d. %s\n", i +1, book.info());
		}
		String idx = SimpleInput.input("- 대여할 도서 번호 입력: ");
		Book found = null;
		if (idx.chars().allMatch(Character::isDigit)) {
			found = LibraryRepository.selectBookI(Integer.parseInt(idx) - 1);
		} else {
			System.out.println("입력값을 확인해주세요");
			return ;
		}
		if (found == null) {
			System.out.println("입력값의 범위를 확인해주세요");
			return ;
		}
		Book pass = LibraryRepository.rent(found);
		if (pass != null) {
			System.out.println("대여돠었습니다");
		} else {
			System.out.println("대여실패했습니다.");
		}

	}

	private static void selectBookByName() {
		String input = SimpleInput.input("# 검색어 : ");
		BookList found = LibraryRepository.selectBookByN(input);
		if (found.getBookList().length == 0) {
			System.out.println("# 검색 결과가 없습니다.");
		}
		System.out.printf("\n======== [%s] 검색 결과 =========", input);
		for (Book book : found.getBookList()) {
			System.out.println(book.info());
		}
	}

	private static void myPage() {
		System.out.println(LibraryRepository.getUser());
	}

	private static String libraryMenuDisplay() {
		System.out.println("\n============도서메뉴===========");
		System.out.println("# 1. 마이페이지\n" +
				"# 2. 도서 전체 조회\n" +
				"# 3. 도서 제목으로 조회\n" +
				"# 4. 도서 대여하기\n" +
				"# 5. 도서 저자이름으로 검색\n" +
				"# 9. 프로그램 종료하기");
		return SimpleInput.input("- 메뉴 번호 : ");
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
