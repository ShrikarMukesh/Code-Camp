package ds.array;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {12, 34, 45, 65, 83};
		int result = searchIndex(arr, 344, 0, arr.length-1);
		if(result==-1) {
			System.out.println("value does't exists");
		}
		else {
			System.out.println(result);
		}
	}
	public static int searchIndex(int[] arr, int val, int start, int end) {
		
		if(arr.length == 0 || start>end) {
			return -1;			
		}
		int mid = (start + end)/2;
		
		if(arr[mid] == val) {
			return mid;
		}
		if(val > arr[mid]) {
			return searchIndex(arr, val, mid + 1, end);
		} else {
			return searchIndex(arr, val, start, mid - 1);
		}

	}
}
