package array;

public class MinMaxInArray {
	static int max;
	static int min;

	static public int findMax(int[] arr) {
		max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {

				max = arr[i];

			}
		}

		return max;

	}

	static public int findMin(int[] arr) {
		min = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (min > arr[i]) {
				min = arr[i];

			}
		}
		return min;
	}

	public static void main(String args[]) {
		final int[] arr = { 1, 4, 34, 32, 34, 5, 54, 6 };

		System.out.printf("Maximum value in array : %d \nMinimum value in array : %d", findMax(arr), findMin(arr));
	}
}
