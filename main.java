
package person;

import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		LInkedlist s = new LInkedlist();

		s.isempty();
		s.insertatback(1);
		s.insertatfront(2);
		s.insertatpos(3, 2);
		s.display();
	}
}
