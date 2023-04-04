package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorProgram {
	// Universal Cursor.
	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		for (int i = 0; i <= 10; i++) {
			ar.add(i);
		}
		System.out.println(ar);

		Iterator itr = ar.iterator();
		System.out.println(ar);
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if (i % 2 == 0) {
				System.out.println(i);
			} else {
				itr.remove();

			}
		}
		System.out.println(ar);
	}

}
