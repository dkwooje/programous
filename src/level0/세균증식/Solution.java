package level0.세균증식;

import java.util.Scanner;

public class Solution {

	public int ABC(int n, int t) {
		for(int i=0;i<t;i++) {
			n=n*2;
		}
		return n;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("수: ");
		int n = scanner1.nextInt();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("시간:");
		int t = scanner2.nextInt();
		
		Solution 세균 = new Solution();
		int result = 세균.ABC(n, t);
		System.out.print("총수: "+ result);
		
	}
}
