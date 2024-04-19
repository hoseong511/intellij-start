package day09.ex01.library;

import util.SimpleInput;

/**
 * packageName    : day09.ex01
 * fileName       : LibraryView
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
public class LibraryView {
	public static String libraryMenuDisplay() {
		System.out.println("\n============도서메뉴===========");
		System.out.println("# 1. 마이페이지\n" +
				"# 2. 도서 전체 조회\n" +
				"# 3. 도서 제목으로 조회\n" +
				"# 4. 도서 대여하기\n" +
				"# 5. 도서 저자이름으로 검색\n" +
				"# 8. 로그아웃하기\n" +
				"# 9. 프로그램 종료하기");
		return SimpleInput.input("- 메뉴 번호 : ");
	}

	public static void showBookList() {
		BookList bookList = LibraryRepository.getBookList();
		System.out.println("\n============ 모든 도서 정보 ===========");
		for (Book book : bookList.getBookList()) {
			System.out.println(book.info());
		}
	}

	public static void selectBookByAuthor() {
		String input = SimpleInput.input("# 검색어 : ");
//		LibraryRepository.
	}

	public static void rentBook() {
		BookList bookList = LibraryRepository.getBookList();
		System.out.println("\n============ 대여 가능한 도서 정보 ===========");
		Book[] list = bookList.getBookList();
		for (int i = 0; i < list.length; i++) {
			Book book = list[i];
			System.out.printf("%d. %s\n", i + 1, book.info());
		}
		String idx = SimpleInput.input("- 대여할 도서 번호 입력: ");
		Book found = null;
		if (idx.chars().allMatch(Character::isDigit)) {
			found = LibraryRepository.selectBookI(Integer.parseInt(idx) - 1);
		} else {
			System.out.println("입력값을 확인해주세요");
			return;
		}
		if (found == null) {
			System.out.println("입력값의 범위를 확인해주세요");
			return;
		}
		Book pass = LibraryRepository.rent(found);
		if (pass != null) {
			LibraryRepository.getUser().getRentBookList().push(pass);
			System.out.println("대여돠었습니다");
		} else {
			System.out.println("대여실패했습니다.");
		}
	}

	public static void showBookByName() {
		String input = SimpleInput.input("# 검색어 : ");
		BookList found = LibraryRepository.selectBookByN(input);
		if (found.getBookList().length == 0) {
			System.out.println("# 검색 결과가 없습니다.");
		}
		System.out.printf("\n======== [%s] 검색 결과 =========\n", input);
		for (Book book : found.getBookList()) {
			System.out.println(book.info());
		}
	}

	public static void showRentalBook() {
		BookList rentBookList = LibraryRepository.getUser().getRentBookList();
		if (rentBookList.getBookList().length == 0) {
			System.out.println("\n대여중인 책이 없습니다!\n");
			return;
		}
		for (Book book : rentBookList.getBookList()) {
			System.out.println(book.info());
		}
	}

	public static void showRentalHistory() {
	}
}
