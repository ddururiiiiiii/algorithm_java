package question.chap01;

// 3개의 정숫값을 입력하고 중앙값을 구하여 출력

import java.util.Scanner;

class Median2 {
	
	static int median(int a, int b, int c) {
		
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return b;
		else if (b > c)
			return c;
		else
			return b;
	}

	public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    System.out.println("세 값중 중앙 값을 구하시오.");
    System.out.print("a의 값 : "); int a = scan.nextInt();
    System.out.print("b의 값 : "); int b = scan.nextInt();
    System.out.print("c의 값 : "); int c = scan.nextInt();
    
    System.out.println("세 값의 중앙 값은 " + median(a, b, c) + " 입니다.");
    }
}