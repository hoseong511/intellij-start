package datastruct.linked;

/**
 * packageName    : datastruct.linked
 * fileName       : Node
 * author         : hoho
 * date           : 4/20/24
 * description    :
 */
public class Node {
	Object obj;
	Node next;
	public Node(Object obj) {
		this.obj = obj;
		this.next = null;
	}

	public Node getNext() {
		return next;
	}

	public Object getObj() {
		return obj;
	}
}
