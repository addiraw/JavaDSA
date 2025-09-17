package array;

import java.util.Arrays;

public class TargetSum {

	class InnerClass1 {

		public int[] targetSumReturn(int[] arr, int targetSum) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] + arr[j] == targetSum) {
						System.out.print(arr[i]);
						return new int[] { i, j };

					}
				}
			}
			return new int[] { -1, -1 };
		}

	}

	public static void main(String args[]) {
		TargetSum tSum = new TargetSum();
		TargetSum.InnerClass1 innerClass1 = tSum.new InnerClass1();
		int[] list = { 1, 2, 4, 34, 5, 6, 4, 34 };
		int[] tempArr = innerClass1.targetSumReturn(list, 6);
		System.out.println("For Array the location of first and second element are :" + Arrays.toString(tempArr));

	}
}
