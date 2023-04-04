package Collection;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// constructors:

		ArrayList al = new ArrayList();
		al.add("Pradip");
		al.add(10);
		al.add('A');
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add("Arati Bogar");
		System.out.println(al);
		al.removeAll(al);
		System.out.println(al);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);

		ArrayList obj = new ArrayList();
		obj.addAll(al);
		System.out.println(obj);

	}

}
