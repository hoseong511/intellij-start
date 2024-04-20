package datastruct.linked;

/**
 * packageName    : datastruct.linked
 * fileName       : NodeList
 * author         : hoho
 * date           : 4/20/24
 * description    :
 */
public class NodeList {
	Node head;
	NodeList(Node node) {
		this.head = node;
	}

	public void add(Node node) {
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = node;
	}

	public void showList() {
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.obj);
			curr = curr.next;
		}
		System.out.println();
	}

}
