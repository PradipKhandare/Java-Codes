package Collection;

import java.util.Vector;

public class VectorListProgram {
// Serializable, Clonable, RandomAccess.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		System.out.println(v.capacity());
		for (int i = 0; i <= 20; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		System.out.println(v.capacity());

	}

}
