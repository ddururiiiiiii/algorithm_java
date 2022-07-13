package practice.chap01;

// 연습1-8
// 정수a, b를 포함하여 그 사이의 모든 정수의 총합을 구합니다

import java.util.Scanner;

class SumOf2 {
	
	
	static int sumof(int a, int b) {
		
		int min, max;
		
		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		} 
		
		int sum = 0;
		
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("a와 b를 포함하 a와 b사이의 모든 값을 더하시오.");
	 System.out.print("a 입력 : "); int a = scan.nextInt();
	 System.out.print("b 입력 : "); int b = scan.nextInt();
	 System.out.println("a와 b사이의 모든 값은 " + sumof(a, b) + "입니다. ");
	}
}
