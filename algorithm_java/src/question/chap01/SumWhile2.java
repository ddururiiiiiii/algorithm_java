package question.chap01;

// while 문으로 1, 2, …, n의 합을 구함

import java.util.Scanner;

class SumWhile2 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        int a = scan.nextInt();
        
        int i = 1;
        int sum = 0;
        while(i <= a) {
        	sum += i;
        	i++;
        }
    
        System.out.println("1부터 " + a + "까지의 합은 " + sum +"입니다." );
    }
}