package Inheritence;

public class Earth {

	public static void main(String[] args) {
		Husky h = new Husky();
		h.loyal();
		h.bark();
		h.eat();

		Dog d = h;
		d.bark();
		d.eat();

		Animal a = d;
		a.eat();

	}

}
