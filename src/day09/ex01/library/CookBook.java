package day09.ex01.library;

/**
 * packageName    : day09.ex01
 * fileName       : CookBook
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
public class CookBook extends Book{

	private final boolean coupon;

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

	public boolean isCoupon() {
		return coupon;
	}

	@Override
	public String info() {
		String title = super.info();
		String prettier;
		if (this.coupon) {
			prettier = "있음";
		} else {
			prettier = "없음";
		}
		return String.format("%s, 쿠폰유무: %s",title, prettier);
	}
}
