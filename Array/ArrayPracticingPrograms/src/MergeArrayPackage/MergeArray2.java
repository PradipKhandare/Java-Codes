package MergeArrayPackage;

public class MergeArray2 {

	public static void main(String[] args) {
		int array1[] = { 1, 2, 3, 4 };
		int l1 = array1.length;// 4

		int array2[] = { 5, 6, 7, 8 };
		int l2 = array2.length;// 4

		int array3[] = new int[l1 + l2];

		mergeArrays(array1, array2, l1, l2, array3);

		for (int i = 0; i < l1 + l2; i++) {
			System.out.print(array3[i] + " ");
		}
	}

	private static void mergeArrays(int array1[], int array2[], int l1, int l2, int array3[]) {

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < l1) {
			array3[k++] = array1[i++];
		}

		while (j < l2) {
			array3[k++] = array2[j++];
		}

	}

}
