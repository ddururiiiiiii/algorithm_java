package practice.chap01;
import java.util.Scanner;

class Max4_3 {
 
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("세 정수의 최댓값을 구합니다.");
	System.out.print("a의 수 : "); int a = scan.nextInt();
	System.out.print("b의 수 : "); int b = scan.nextInt();
	System.out.print("c의 수 : "); int c = scan.nextInt();
	System.out.print("d의 수 : "); int d = scan.nextInt();
	
	int max = a;
	if (max < b) max = b;
	if (max < c) max = c;
	if (max < d) max = d;
	
	System.out.println("4개의 수 중에 최대 값은 " + max + " 입니다.");
	
	}
}

