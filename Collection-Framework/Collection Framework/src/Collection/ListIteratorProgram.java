package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorProgram {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add("Pradip");
		l.add("Ramesh");
		l.add("Khandare");
		System.out.println(l);

		ListIterator li = l.listIterator();
		while (li.hasNext()) {
			String s = (String) li.next();
			if (s.equals("Pradip")) {
				li.remove();

			} else if (s.equals("Ramesh")) {
				li.add("Pradip");
			} else if (s.equals("Khandare")) {
				li.set("Khandare Patil");
			}
		}

		System.out.println(l---);
	}

}
