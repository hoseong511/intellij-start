package day09.ex01.library;

/**
 * packageName    : day09.ex01
 * fileName       : Book
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
public class Book {
	private String title; // 도서명
	private String author; // 저자명
	private String publisher; // 출판사명


	public Book() {}

	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	// 책 정보 문자열 생성
	public String info() {
		// 문자열 글자수 얻기 length()
		int length = this.title.length();
		String prettier;
		if (length > 8) {
			// 문자열 슬라이스 substring()
			prettier = this.title.substring(0, 8) + "...";
		} else {
			prettier = this.title;
		}
		String category = "";
		if (this instanceof CookBook) {
			category = "요리책";
		} else if (this instanceof CartoonBook) {
			category = "만화책";
		}

		return String.format("# 분류: %s, 제목: %s", category, prettier);
	}

}
