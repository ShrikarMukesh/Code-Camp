package ds.array;
@SuppressWarnings("unused")
public class DeleteFromArray {
	static int count;
	public static void main(String[] args) {

		int[] arr = {12, 34, 45, 6, 13};
		count = arr.length;
		print(arr);
		//deleteFromEnd(arr);
		//deleteValue(arr,45);
		deleteFromPosition(arr,2);
		print(arr);

	}

	private static void deleteValue(int[] arr, int val) {
		int i;
		for(i=0;i<count;i++) {
			if(arr[i] == val) {
				break;
			}
		}
		if(i==count) {
			System.out.println("element does't exitss");
			return;
		}
		for(int j = i; j < count - 1; j++) {
			arr[j] = arr[j + 1];
		}	    
		count--;
	}
	public static void deleteFromPosition(int a[], int position) {
		if(position > count || position <= 0) {
			System.out.println("Invalid Position");
			return;
		}

		for(int i = position - 1; i < count - 1; i++) {
			a[i] = a[i + 1];
		}
		count--;
	}

	private static void deleteFromEnd(int[] arr) {
		if(arr.length == 0) {
			return;
		}
		count--;
	}
	static void print(int[] arr) {
		for(int i=0;i<count;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
