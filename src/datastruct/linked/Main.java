package datastruct.linked;

/**
 * packageName    : datastruct.linked
 * fileName       : Main
 * author         : hoho
 * date           : 4/20/24
 * description    :
 */
public class Main {
	public static void main(String[] args) {
		NodeList lst = new NodeList();
		lst.add(new Node(new A(2)));
		lst.add(new Node(new A(3)));
		lst.add(new Node(new A(4)));
		lst.add(new Node(new A(5)));
		lst.add(new Node(new A(6)));
		lst.showList();
//		System.out.println(new A(19));
	}
}
