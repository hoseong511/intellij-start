package day09.ex01.library;

import day09.ex01.member.BookUser;

/**
 * packageName    : day09.ex01
 * fileName       : LibraryRepository
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
public class LibraryRepository {
	private static BookUser user;
	private static BookList bookList;

	static {
		user = null;
		bookList = new BookList();
		bookList.push(new CookBook("기적의 집밥책", "김해진", "청림라이프", true));
		bookList.push(new CartoonBook("떨어지면 끝장맨", "스에노부 케이코", "대원씨아이", 18));
		bookList.push(new CartoonBook("원펀맨", "One", "대원씨아이", 15));
		bookList.push(new CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false));
		bookList.push(new CookBook("오늘은 아무래도 덮밥", "이마이 료", "참돌", true));
		bookList.push(new CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "Shinkoshoto", "대원씨아이", 12));
	}

	public static BookUser getUser() {
		return user;
	}

	public static void setUser(BookUser user) {
		LibraryRepository.user = user;
	}

	public static BookList getBookList() {
		return bookList;
	}

	public static BookList selectBookByN(String name) {
		BookList tmp = new BookList();
		for (Book book : bookList.getBookList()) {
			if (book.getTitle().contains(name)) {
				tmp.push(book);
			}
		}
		return tmp;
	}

	public static Book selectBookI(int idx) {
		if (idx < 0 || bookList.getBookList().length <= idx)
			return null;
		return bookList.getBookList()[idx];
	}

	public static Book rent(Book book) {
		if (book instanceof CookBook && ((CookBook) book).isCoupon()) {
			user.setCouponCount(user.getCouponCount() + 1);
		} else if (book instanceof CartoonBook) {
			if (((CartoonBook) book).getLimitAge() > user.getAge()) {
				return null;
			}
		}
		bookList.remove(book);
		return book;
	}
}
