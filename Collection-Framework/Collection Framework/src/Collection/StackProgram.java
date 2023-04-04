package Collection;

import java.util.Stack;

public class StackProgram {
// Child class of vector 
// Last in First out.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s = new Stack();
		s.push(1000);
		s.push(20000);
		s.push(3000);
		s.push(4000);
		s.push(5000);
		System.out.println(s);
		System.out.println(s.pop());
		s.push(5000);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
	}

}
