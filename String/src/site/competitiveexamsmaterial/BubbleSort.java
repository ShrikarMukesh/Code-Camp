package site.competitiveexamsmaterial;

public class BubbleSort {
	public static void main(String[] args) {
       int[] arr = {27,9,1,22,5,2};
       bubblesort(arr);
       for(int i =0;i< arr.length;i++) {
    	   System.out.println(arr[i]);
       }
	}

	private static void bubblesort(int[] arr) {
		int temp =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<(arr.length)-i;j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j -1 ] = arr[j];
					arr[j]  = temp;
				}
			}
		}
	}

	
}
