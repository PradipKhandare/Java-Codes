package PolyMorphism;

public class Earth {

	public static void main(String[] args) {
		GermanShefard g = new GermanShefard();
		g.loyal();
		g.bark();
		g.eat();
		Dog d = g;
		d.bark();
		d.eat();
		Animal a = d;
		a.eat();
	}

}
