package programmers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
	        int[] answer = new int[6];
	        
	        Scanner scan = new Scanner(System.in);
	        
	        for (int i = 0; i < 6; i++) {
	        	System.out.print("내 로또번호 " + (i+1) + "번째 숫자 : ");
	        	answer[i] = scan.nextInt();

	        	//로또번호 6개 한정 임.
	        	do {
	        		System.out.println("로또번호는 1~45번까지만 가능합니다.");
	        	} while(answer[i] < 1 || answer[i] > 45);
	        	
	        	//로또번호 중복방지
	        	for (int j = 0; j < answer.length; j++) {
	        		if (answer[j] == answer[i]) {
	        		}
					System.out.println("이미 입력된 로또번호입니다.");

				}
	        }
	        System.out.println("=== 내 로또번호 입력 끝 ===");
	        System.out.println(Arrays.toString(answer));
	        
	}
}
