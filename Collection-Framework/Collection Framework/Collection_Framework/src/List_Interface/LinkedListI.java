package List_Interface;

import java.util.LinkedList;

//best choice if our frequent operation is deletion or insertion in middle.
public class LinkedListI {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.add("Pradip");
		ll.add("Khandare");
		ll.add(1997);
		ll.add(443301);
		System.out.println(ll);
		ll.addFirst("First");
		ll.addLast("Last");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());

		System.out.println(ll);
	}

}
