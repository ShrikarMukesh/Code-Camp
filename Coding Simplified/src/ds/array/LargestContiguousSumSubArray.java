package ds.array;

public class LargestContiguousSumSubArray {
	
	public static void main(String[] args) {	
		int arr[] = {-3, -4, 4, -1, -2, 1, 5, -3};
		System.out.println(largestContiguousSubArrayNegative(arr));
	}
	
	public static int largestContiguousSubArrayNegative(int[] a) {
		int max_so_far, current_max;
		max_so_far = current_max = a[0];

		for(int i = 1; i < a.length; i++) {
			current_max = Math.max(a[i], current_max + a[i]);
			max_so_far = Math.max(current_max, max_so_far);
		}

		return max_so_far;
	}
}
