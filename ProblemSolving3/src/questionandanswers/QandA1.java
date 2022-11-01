//1.	Write a function that finds the sum of an array. Make your function recursive.

//Input - new int[]{1, 2, 3, 4}, Correct - 10

package questionandanswers;

public class QandA1 {
	static int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

	static int sumOfArray(int a[], int n) {
		if (n <= 0) {
			return 0;

		}
		return (sumOfArray(a, n - 1) + a[n - 1]);
	}

	public static void main(String[] args) {
		System.out.println(sumOfArray(arr, arr.length));
	}

}
