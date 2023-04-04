package RemoveDuplicatesFromArray;

public class Remove1 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 2, 3, 4, 5, 5 };
		int n1 = arr.length;
		removeDuplicates(arr, n1);

		System.out.println();
	}

	public static void removeDuplicates(int[] arr, int n1) {
		int insertIndex = 1;
		for (int i = 1; i < n1; i++) {
			if (arr[i - 1] != arr[i]) {
				arr[insertIndex] = arr[i];
				insertIndex++;
				System.out.print(insertIndex + " ");
			}
		}

	}

}
