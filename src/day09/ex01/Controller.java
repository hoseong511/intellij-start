package day09.ex01;

import day09.ex01.library.LibraryRepository;
import day09.ex01.library.LibraryView;
import day09.ex01.member.MemberView;

/**
 * packageName    : day09.ex01.library
 * fileName       : Controller
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
public class Controller {
	private static Controller obj = new Controller();

	private Controller() {
	}

	public static Controller getObj() {
		return obj;
	}

	public void start() {
		while (true) {
			if (LibraryRepository.getUser() == null) {
				if (memberMenu() == 0) break ;
				continue;
			}
			if (libraryMenu() == 0) break;
		}
	}

	private static int libraryMenu() {
		switch (LibraryView.libraryMenuDisplay()) {
			case "1":
				myPageSubMenu();
				break;
			case "2":
				LibraryView.showBookList();
				break;
			case "3":
				LibraryView.showBookByName();
				break;
			case "4":
				LibraryView.rentBook();
				break;
			case "5":
				LibraryView.selectBookByAuthor();
				break;
			case "8":
				MemberView.signOut();
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

	private static void myPageSubMenu() {
		while (true) {
			switch (MemberView.showMyPage()) {
				case "1": // 대여중 책 정보
					LibraryView.showRentalBook();
					break;
				case "2": // 대여 기록
					LibraryView.showRentalHistory();
					break;
				case "3": // 메뉴나가기
					System.out.println("\n메뉴를 나갑니다\n");
					return;
				default:
					System.out.println("\n올바른 메뉴를 선택해주세요.\n");
					break;
			}
		}
	}

	private static int memberMenu() {
		switch (MemberView.showProgramMenu()) {
			case "1":
				MemberView.showSignIn();
				break;
			case "2":
				MemberView.showSignUpMenu();
				break;
			case "9":
				System.out.println("프로그램 종료합니다.");
				return 0;
			default:
				MemberView.wrongMenuNumber();
				break;
		}
		return 1;
	}
}
