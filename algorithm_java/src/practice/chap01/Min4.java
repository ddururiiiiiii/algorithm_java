package practice.chap01;

import java.util.Scanner;

public class Min4 {
	
	
	static int min3(int a, int b, int c) {
		
		int min = a;
		if (min > b) min = b;
		if (min > c) min = c;
		
		return min;
		
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세 값의 최솟값을 구하시오.");
		System.out.print("a의 수 : "); int a = scan.nextInt();
		System.out.print("b의 수 : "); int b = scan.nextInt();
		System.out.print("a의 수 : "); int c = scan.nextInt();
		
		int min = min3(a, b, c);
		System.out.println("세 값의 최소값은 " + min + " 입니다.");
	}

}
