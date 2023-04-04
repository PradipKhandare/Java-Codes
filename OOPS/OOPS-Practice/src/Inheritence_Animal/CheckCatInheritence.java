package Inheritence_Animal;

public class CheckCatInheritence {

	public static void main(String[] args) {
		Cat cat = new Cat(false, "milk", 4, "Black");

		System.out.println(cat.isVegetarian());
		System.out.println(cat.getEats());
		System.out.println(cat.getNoOfLegs());
		System.out.println(cat.getColor());

	}

}
