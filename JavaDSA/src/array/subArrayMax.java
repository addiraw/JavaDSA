package array;

public class subArrayMax {

	int MaxString(int[] arr) {
		// [3,3,3,-1]
		int max = arr[0];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (max < sum) {
					max = sum;
					System.out.println(max);

				}
			}
		}
		return max;
	}

	public static void main(String args[]) {
		subArrayMax s = new subArrayMax();
		int[] arr = { 4, 2, 4, 65, -1, -222, 3, -54, 55 };
		System.out.print(s.MaxString(arr));
	}

}
