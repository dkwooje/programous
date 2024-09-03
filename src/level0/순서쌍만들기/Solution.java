package level0.순서쌍만들기;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
	
	
    public int ABC(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }



	public static void main(String[] args) {
	
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("숫자를 입력하세요: ");
	        int n = scanner.nextInt();  // 사용자가 입력한 값을 받음

	        Solution sol = new Solution();
	        int result = sol.ABC(n);  // 입력값을 이용해 solution 메서드 실행

	        System.out.println("약수의 개수: " + result);  // 결과 출력
	    }
	}