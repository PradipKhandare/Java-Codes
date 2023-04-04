package E1;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
		// TODO Auto-generated constructor stub
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

	public boolean isConsonent() {
		if (ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u') {

			return true;
		}
		return false;

	}

	public boolean isNumber() {
		if (ch >= 48 && ch <= 57)
			return true;

		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 97 && ch == 122)
			return true;

		return false;
	}

	public static void printLowerCaseAlphabet() {
		for (char i = 97; i <= 122; i++) {
			System.out.println(i);
		}

	}

	public static void printUpperCaseAlphabet() {
		for (char i = 65; i <= 90; i++) {
			System.out.println(i);
		}

	}

}
