package Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

//ListIterator is a child interface of iterator.
public class ListIteratorCursor {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		for (int i = 0; i <= 20; i++) {
			al.add(i);
		}
		System.out.println(al);

		ListIterator li = al.listIterator();

		while (li.hasNext()) {
			Integer i = (Integer) li.next();
			if (i % 2 == 0) {
				System.out.println(i);
			} else {
				li.remove();
			}
		}
		System.out.println(al);

	}

}
