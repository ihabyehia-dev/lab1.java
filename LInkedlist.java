
package person;

public class LInkedlist {
	Node head;
	Node n = new Node();

	boolean isempty() {
		boolean ok = false;

		if (head == null) {
			return ok = true;
		}
		return ok;
	}

	void insertatfront(int v) {
		Node n = new Node(v);
		n.next = head;
		head = n;
	}

	void insertatback(int v) {
		Node n = new Node(v);

		if (isempty() == true) {
			head = n;
			return;
		}
		Node current = head;

		while (current.next != null) {
			current = current.next;
		}

		current.next = n;
	}

	void insertatpos(int a, int b) {
		Node n = new Node(a);
		Node current = head;
		Node prev = current;

		if (isempty() == true) {
			return;
		}

		if (head.data == b) {
			n.next = head;
			head = n;
			return;
		}

		while (current.data != b) {
			prev = current;
			current = current.next;
		}
		n.next = current;
		prev.next = n;
	}

	void display() {
		Node current = head;

		while (current != null) {
			System.out.println(current.data + ",");
			current = current.next;
		}
	}
}
