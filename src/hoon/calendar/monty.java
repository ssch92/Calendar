package hoon.calendar;

import java.util.Scanner;

public class monty {

	public static void main(String[] args) {
		
		System.out.println("달을 입력하세요."); // 입력 : 달을 입력하세요.
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int days = maxDays[m-1];
		
		System.out.printf("%d월은 %d일까지 있습니다.\n",m,days);
		sc.close();
	
//		if( m ) {
//			System.out.println("%d월은 31일까지 있습니다.")
//		}
		
		
		

	}

}
