package ds.array;

import java.util.HashSet;

public class CheckMultiplicaton {
	public static void main(String[] args) {
       int[] a = {4,1,3,10,7,5,8};int find =15;
       boolean result =  findValue1(a,find);
       System.out.println(result);
       int arr[] = { 4, 2, 3, 10, 4, 15, 3, 6 };
       System.out.println(checkIfProductOfPairMatchesValue(arr,15));
	}
	public static boolean checkIfProductOfPairMatchesValue(int[] arr, int val) {
	    HashSet<Integer> s = new HashSet<>();
	    
	    for(int i = 0; i < arr.length; i++) {
	      
	      if(val % arr[i] == 0 && s.contains(val / arr[i])) {
	        return true;
	      }
	      s.add(arr[i]);
	    }
	    return false;
	  }
	private static boolean findValue1(int[] a, int find) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]* a[j] == find) {
					return true;
				}
			}
		}
		return false;	
	}
}
