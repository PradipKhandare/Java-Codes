package Collection;

import java.util.LinkedList;

public class LinkedListProgram {
//Underlying data structure is doublee linked list.
	public static void main(String[] args) {

		LinkedList li = new LinkedList();
		li.add(10);
		li.add("Pradip");
		li.add('A');
		li.add("Khandare");
		li.add(20);
		li.add("hexaware");
		li.addFirst("First Element");
		li.addLast("Last element");
		System.out.println(li);
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		System.out.println(li.removeFirst());
		System.out.println(li.removeLast());
		System.out.println(li);
		li.set(0, "First");
		li.set(1, "2nd");
		System.out.println(li);

	}

}
