package E1;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('c');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsonent());
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlphabet());
		MyChar.printLowerCaseAlphabet();
		MyChar.printUpperCaseAlphabet();
		// TODO Auto-generated method stub

	}

}
