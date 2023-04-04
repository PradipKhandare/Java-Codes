package List_Interface;

import java.util.Vector;

public class VectorI {

	public static void main(String[] args) {
		Vector vec = new Vector();
		vec.add("Golu");
		vec.add(1997);
		System.out.println(vec);
		vec.remove(0);
		System.out.println(vec);

	}

}
