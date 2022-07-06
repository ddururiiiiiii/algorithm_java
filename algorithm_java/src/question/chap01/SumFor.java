package question.chap01;

// for 문으로 1, 2, …, n의 합을 구함

import java.util.Scanner;

class SumFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n 값 : ");
        int a = scan.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i <= a; i++) {
        	sum += i;
        }

        System.out.println("1부터" + a + "까지의 합은 " + sum + "입니다.");
    }
}