package MergeArrayPackage;

import java.util.Arrays;

public class Merge5 {

	public static void main(String[] args) {
		char arr1[] = { 'a', 'b', 'c' };
		int n1 = arr1.length;

		char arr2[] = { 'd', 'e', 'f' };
		int n2 = arr2.length;

		char arr3[] = new char[n1 + n2];
		merge(arr1, arr2, n1, n2, arr3);

		for (int i = 0; i < n1 + n2; i++) {
			System.out.print(arr3[i] + " ");
		}

	}

	public static void merge(char[] arr1, char[] arr2, int n1, int n2, char[] arr3) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < n1) {
			arr3[k++] = arr1[i++];
		}
		while (j < n2) {
			arr3[k++] = arr2[j++];
		}

		Arrays.sort(arr3);
	}

}
