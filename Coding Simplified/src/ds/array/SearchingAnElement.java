package ds.array;

public class SearchingAnElement {
	public static void main(String[] args) {
		
		int[] arr = {12, 34, 45, 6, 13};
		int i = searchIndex(arr, 34);		    
		System.out.println(i);
	}
	public static int searchIndex(int a[], int val) {
		if(a.length == -1) {
			return -1;
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] == val) {
				return i;
			}
		}
		return -1;
	}
}
