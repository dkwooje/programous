package level0.자릿수더하기;

import java.util.Scanner;

public class Solution {

	public int ABC(int n) {
		
    int result = 0;
    while(n>0){
       result= result+(n%10);
       n = n/10;
    }
   return result;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("수: ");
		int n = scanner.nextInt();
		
		Solution sol = new Solution();
		int result = sol.ABC(n);
		System.out.print("결과:" + result);
		
		
	}
	
}
