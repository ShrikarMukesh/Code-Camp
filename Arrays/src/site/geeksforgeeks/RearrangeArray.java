package site.geeksforgeeks;

public class RearrangeArray {
	public static void main(String[] args) {
		
       int a = check(100,200);
       System.out.println(a);
	}
	static int check(long x,long s) {
		
		int item = (int) minus(s);				
		switch(item) {
		
		case 100:return 1;
		case 200:return 2;
		case 300:return 3;
		case 400:return 4;
		case 500:return 5;
		case 600:return 6;
		case 700:return 7;
		case 800:return 8;
		case 900:return 9;
		case 1000:return 10;
		case 1100:return 11;
		case 1200:return 12;
		}
		return 0;
	}
	static long minus(long s) {
		
		if(s<1200) {			
			return s;
		}else {
			s = s-1200;
			return minus(s);
		}	
	}

}
