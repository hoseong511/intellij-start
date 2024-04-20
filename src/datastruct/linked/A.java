package datastruct.linked;

/**
 * packageName    : datastruct.linked
 * fileName       : A
 * author         : hoho
 * date           : 4/20/24
 * description    :
 */
public class A {
	int idx;

	public A(int idx) {
		this.idx = idx;
	}

	@Override
	public String toString() {
		return "A{" + "this : " + String.valueOf(this.hashCode()) +
				", idx=" + this.idx +
				"}";
	}
}
