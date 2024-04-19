package day09.ex01.library;

/**
 * packageName    : day09.ex01
 * fileName       : CartoonBook
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
public class CartoonBook extends Book{
	private final int limitAge;

	public CartoonBook(String title, String author, String publisher, int limitAge) {
		super(title, author, publisher);
		this.limitAge = limitAge;
	}

	public int getLimitAge() {
		return limitAge;
	}

	@Override
	public String info() {
		String title = super.info();
		return String.format("%s, 연령제한: %d세",title, this.limitAge);
	}
}
