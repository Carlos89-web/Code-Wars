
public class DiferenciasArrays {

	// https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e/solutions

	public static int sumOfDifferences(int[] arr) {
		if (arr.length < 2) {
			return 0;
		}

		int min = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return max - min;

	}

}
