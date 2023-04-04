package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		LinkedHashSet l = new LinkedHashSet();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");
		l.add(null);
		l.add("last");
		System.out.println(l.add("a"));
		System.out.println(l);

	}

}
