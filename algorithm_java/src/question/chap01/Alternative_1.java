package question.chap01;

// +와 -를 번갈아 출력(1)

import java.util.Scanner;

class Alternative_1 {

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int n;
    	do {
    	System.out.println("+와 -를 n번 번갈아가며 출력하세요.");
    	n = scan.nextInt();
    	} while (n <= 0);
    	
    	for (int i = 0; i < n; i++) {
    		if (i % 2 == 0)
    			System.out.print("+");
    		else
    			System.out.print("-");
    	}
    	
    	
    }
}