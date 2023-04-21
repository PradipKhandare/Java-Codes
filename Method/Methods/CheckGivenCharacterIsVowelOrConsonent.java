package Methods_Practicing;

public class CheckGivenCharacterIsVowelOrConsonent {

	public static void main(String[] args) {
		String res = check();
		System.out.println(res);
	}

	public static String check() {
		String vow = "the given character is vowel";
		String con = "the given character is consonent";
		char ch = 'i';
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return vow;
		} else {
			return con;
		}
	}

}
