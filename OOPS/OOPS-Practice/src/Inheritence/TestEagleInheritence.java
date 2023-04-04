package Inheritence;

public class TestEagleInheritence {

	public static void main(String[] args) {
		Eagle myEagle = new Eagle();
		System.out.println("Name: " + myEagle.name);
		System.out.println("Reproduction: " + myEagle.reproduction);
		myEagle.flyUp();;
		myEagle.flyDown();;

	}

}
