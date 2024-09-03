package note;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
		
	public int Text(int n) {
		return (int) IntStream.rangeClosed(1, n).filter(i-> n%i == 0).count();
	}
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int n = scanner.nextInt();
		
		Solution sol = new Solution();
		int result = sol.Text(n);
		
		System.out.println("약수의 개수" + result);
	}
}
