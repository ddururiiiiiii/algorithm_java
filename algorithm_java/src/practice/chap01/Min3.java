package practice.chap01;

import java.util.Scanner;

public class Min3 {
	
	
	static int min4(int a, int b, int c, int d) {
		
		int min = a;
		if (min > b) min = b;
		if (min > c) min = c;
		if (min > d) min = d;
		
		return min;
		
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" 값의 최솟값을 구하시오.");
		System.out.print("a의 수 : "); int a = scan.nextInt();
		System.out.print("b의 수 : "); int b = scan.nextInt();
		System.out.print("c의 수 : "); int c = scan.nextInt();
		System.out.print("d의 수 : "); int d = scan.nextInt();
		
		int min = min4(a, b, c,d);
		System.out.println("네 값의 최소값은 " + min + " 입니다.");
	}

}
