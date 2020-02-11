package site.geeksforgeeks;

public class RotateRight {
	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, 3, 4, 5};
		int n=3;
		for(int i=0;i<n;i++) {
			
			int flag = arr[arr.length-1];
			
			for(int j = arr.length-1; j > 0; j--){    
				arr[j] = arr[j-1];    
			}    
			arr[0] = flag;    
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
