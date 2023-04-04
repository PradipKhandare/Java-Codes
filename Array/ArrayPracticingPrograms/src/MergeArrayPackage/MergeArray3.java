package MergeArrayPackage;

public class MergeArray3 {

	public static void main(String[] args) {
		String name[] = { "Pradip", "Khandare" };
		int n1 = name.length;

		String friend[] = { "Arati", "Bogar" };
		int n2 = friend.length;

		String couple[] = new String[n1 + n2];

		combinePeoples(name, friend, n1, n2, couple);

		for (int i = 0; i < couple.length; i++) {
			System.out.print(couple[i] + "  ");
		}

	}

	public static void combinePeoples(String[] name, String[] friend, int n1, int n2, String[] couple) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < n1) {
			couple[k++] = name[i++];
		}

		while (j < n2) {
			couple[k++] = friend[j++];
		}
	}

}
