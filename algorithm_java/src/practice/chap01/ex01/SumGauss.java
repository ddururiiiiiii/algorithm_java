package practice.chap01.ex01;

// 연습1-7
// 가우스 공식을 사용하여 1, 2, ..., n의 총합을 구합니다

import java.util.Scanner;

class SumGauss {
	// 가우스공식관련 내용
	// https://workshop-code.tistory.com/51?category=747867
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1에서 n까지의 총합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);   // 총합

		System.out.println("1에서 " + n + "까지의 총합은 " + sum + "입니다.");
	}
}
