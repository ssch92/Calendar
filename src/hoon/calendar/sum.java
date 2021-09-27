package hoon.calendar;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		String inputValue = sc.nextLine();	
		
		String[] splitedValue = inputValue.split(" ");
		
		int a = Integer.parseInt(splitedValue[0]);
		int b = Integer.parseInt(splitedValue[1]);	
		
//		System.out.print("두 수의 합은 "+(first+second)+"입니다.");
		System.out.printf("%d와 %d의 합은 %d입니다.",a,b, a+b);
		
		sc.close();

	}

}
