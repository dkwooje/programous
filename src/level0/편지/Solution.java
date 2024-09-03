package level0.편지;

import java.util.Scanner;

public class Solution {

	public int ABC(String n){
		
		int i = n.length();
		return i*2;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("메세지");
		String n = scanner.next();
		
		Solution mail = new Solution();
		int result = mail.ABC(n);
		System.out.println("길이:" + result);
		
		

	}

}
