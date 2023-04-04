package List_Interface;

import java.util.Stack;

//child class of vector
//Last in first out.

public class StackI {

	public static void main(String[] args) {

		Stack st = new Stack();
		st.push("Name");// push => to insert object into the stack
		st.push(1997);
		st.push('A');
		st.push(null);
		System.out.println(st);
		System.out.println(st.pop());// pop => to remove and return last of the object
		System.out.println(st);
		st.peek();
		System.out.println(st.peek());// peak => to return last object without removing.
		System.out.println(st.search(1997));// search => to return offset of object.

	}

}
