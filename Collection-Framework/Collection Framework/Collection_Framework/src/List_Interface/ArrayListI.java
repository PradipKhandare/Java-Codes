package List_Interface;

import java.util.ArrayList;

//best choice if our frequent operation is retrieval from the middle because of RandomAccess.
public class ArrayListI {
	// List interface specific methods:
	// 1) void add(int index, object o);
	// 2)boolean addAll(int index, collection c);
	// 3)Object get (int index);
	// 4)Object set (int index);
	// 5) int indexOf(Object o);
	// 6)int lastIndexOf(Object o);
	// 7)ListIterator listIterator();

	// Arraylist and Vector implements RandomAccess.

	public static void main(String[] args) {
		ArrayList al = new ArrayList();// Create arraylist with default initial capacity 10.
		al.add("Pradip");
		al.add(1997);
		al.add("Pimpri");
		al.add(null);
		System.out.println(al);
		al.add(1, "Khandare");
		System.out.println(al);
		ArrayList nal = new ArrayList();
		nal.add("Pimpri Khandare");
		nal.add("Taluka- Lonar");
		nal.add("Dist - Buldana");
		nal.add(443301);
		al.addAll(nal);
		System.out.println(al);
		System.out.println(al.indexOf(1997));
		System.out.println(al.lastIndexOf(null));
		System.out.println(al.remove(1));

	}

}
