package question.chap01;

// 2자리의 양수(10 ~ 99)를 입력
import java.util.Scanner;

class TwoDigits {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int no;
    	
    	System.out.println("2자리 양수를 입력하세요.");
    	
    	do {
    		System.out.print("no값 : ");
    		no = scan.nextInt();
    	}while(no < 10 || no > 99);
    	
    	
    	System.out.println("no의 값은 " +  no + "이 되었습니다.");
    }
}