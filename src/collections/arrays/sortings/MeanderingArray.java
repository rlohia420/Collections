package collections.arrays.sortings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MeanderingArray {
	public static void main(String[] args) {
		int[] arr = { 12, 23, 45, 31, 11, 98, 22, 90 };
		meanderingarray(arr);
	}

	private static void meanderingarray(int arr[]) {
		List<Integer> unsorted = new ArrayList<>();
		for (int x = 0; x < arr.length; x++) {
			unsorted.add(arr[x]);
		}
		int n = arr.length;
		// Sorting the array elements
		Arrays.sort(arr);
		Collections.sort(unsorted);

		int[] tempArr = new int[n]; // To store modified array

		// Adding numbers from sorted array to
		// new array accordingly
		int ArrIndex = 0;

		// Traverse from begin and end simultaneously
		for (int i = 0, j = n - 1; i <= n / 2 || j > n / 2; i++, j--) {
			if (ArrIndex < n) {
				tempArr[ArrIndex] = arr[i];
				ArrIndex++;
			}

			if (ArrIndex < n) {
				tempArr[ArrIndex] = arr[j];
				ArrIndex++;
			}
		}

		// Modifying original array
		for (int i = 0; i < n; i++) {
			arr[i] = tempArr[i];
			System.out.println(arr[i]);
		}
	}
}