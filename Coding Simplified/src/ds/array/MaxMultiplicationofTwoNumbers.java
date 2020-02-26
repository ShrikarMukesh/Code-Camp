package ds.array;

public class MaxMultiplicationofTwoNumbers {
	public static void main(String[] args) {
		int[] arr = {1,12,6,5,7,6};
		System.out.println(maxMultiplicationofanytwoNumbersinArray(arr));
		System.out.println(getMaxMultiplicationOfTwoNumbers(arr));
	}
	public static int maxMultiplicationofanytwoNumbersinArray(int[] arr) {

		int max =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(max<arr[i]*arr[j]) {
					max = max + (arr[i] * arr[j]);
				}
			}
		}
		return max;
	}
	public static int getMaxMultiplicationOfTwoNumbers(int[] arr) {
		
		if(arr.length < 2) {
			return -1;
		}

		if(arr.length == 2) {
			return arr[0] * arr[1];
		}

		int smallest = arr[0] < arr[1] ? arr[0] : arr[1];
		int secondSmallest = arr[0] > arr[1] ? arr[0] : arr[1];

		int greatest = arr[0] > arr[1] ? arr[0] : arr[1];
		int secondGreatest = arr[0] < arr[1] ? arr[0] : arr[1];


		for(int i = 2; i < arr.length; i++) {

			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if(arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}

			if(arr[i] > greatest) {
				secondGreatest = greatest;
				greatest = arr[i];
			} else if(arr[i] > secondGreatest) {
				secondGreatest = arr[i];
			}
		}

		int firstTwoMultiplication = smallest * secondSmallest;
		int lastTwoMultiplication = greatest * secondGreatest;

		return firstTwoMultiplication > lastTwoMultiplication ?  firstTwoMultiplication : lastTwoMultiplication;
	}
}
