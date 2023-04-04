package Collection;

import java.util.HashSet;

public class HashSetProgram {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(10);
		h.add(12);
		h.add("Wowwwwwwwwwwwwwwwww");
		h.add("Pradu");
		System.out.println(h.add(10));// false
		System.out.println(h);
	}

}
