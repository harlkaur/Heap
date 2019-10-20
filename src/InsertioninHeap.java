import java.util.Scanner;

public class InsertioninHeap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = n;
		}
		int key = 15;
		insertElement(arr, n, key);
		printArray(arr, n);
	}

	private static void insertElement(int[] arr, int n, int key) {
		n = n + 1;
		arr[n - 1] = key;
		heapify(arr, n, n - 1);
	}

	private static void heapify(int[] arr, int n, int i) {
		int parent = (i - 1) / 2;
		if (parent >= 0) {
			if (arr[i] > arr[parent]) {
				// swap both of them;
				int swap = arr[i];
				arr[i] = arr[parent];
				arr[parent] = swap;

				heapify(arr, n, parent);
			}
		}

	}

	static void printArray(int arr[], int n) {
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}
}
