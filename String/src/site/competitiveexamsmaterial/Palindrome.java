package site.competitiveexamsmaterial;

public class Palindrome {
	public static void main(String[] args) {
		String  s = "gadag";
       String temp = "";
        
		for(int i =s.length()-1;i>=0;i--) {
			 temp = temp + s.charAt(i);			
		}
		if(temp.equals(s)){
			System.out.println("Is palin");
		}else {
			System.out.println("Not palin");
		}
	}
}
