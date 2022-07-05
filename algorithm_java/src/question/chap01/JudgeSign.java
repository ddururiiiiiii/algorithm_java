package question.chap01;

// 입력한 정숫값의 부호(양수/음수/0)를 판단

import java.util.Scanner;

class JudgeSign {
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("정수를 입력하세요.");

    	int a = scan.nextInt();
    	
    	if (a > 0) System.out.println("양수입니다.");
    	else if (a < 0) System.out.println("음수 입니다.");
    	else System.out.println("0 입니다.");
    	
    }
}