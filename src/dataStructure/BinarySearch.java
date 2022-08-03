package dataStructure;

public class BinarySearch {

	static int BSearch(int arr[], int target) {
		int first = 0;
		int last = arr.length - 1;
		int mid;

		while (first <= last) {
			mid = first + last;
			if (target == arr[mid]) {
				return mid;
			} else {
				if (target < arr[mid])
					last = mid - 1;
				else
					first = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 10, 12 };

		System.out.println(BSearch(arr, 13));

	}
}
