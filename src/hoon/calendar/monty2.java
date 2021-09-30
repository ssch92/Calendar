package hoon.calendar;

import java.util.Scanner;

public class monty2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		System.out.println("반복횟수를 입력하세요.");
		int rep = sc.nextInt();

		for (int i = 0; i < rep; i++) {

			System.out.println("달을 입력하세요.");
			int m = sc.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다.\n", m, cal.getmaxDaysOfMonth(m));
			cal.printSampleCalendar();
		}
		
		System.out.println("Bye");
		sc.close();

	}

}
