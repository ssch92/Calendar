package hoon.calendar;

import java.util.Scanner;

public class monty {

	public static void main(String[] args) {
		
		System.out.println("달을 입력하세요."); // 입력 : 달을 입력하세요.
		Scanner sc2 = new Scanner(System.in);
		Calendar cal = new Calendar();
		int m = sc2.nextInt();

		System.out.printf("%d월은 %d일까지 있습니다.\n", m, cal.getmaxDaysOfMonth(m));
		cal.printSampleCalendar();
		
		sc2.close();

	}

}
