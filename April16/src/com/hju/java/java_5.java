package com.hju.java;

import java.util.Scanner;

public class java_5 {
	public static void main(String[] args) {
		boolean run = true;
		
		int x = 0;
		int balance = 0;
		int sum = 0;
		int sum2 = 0;
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		while (run) {
			System.out.println("-----------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------");
			System.out.print("선택> ");
			
			x = sc.nextInt();
			
			if (x == 1) {
				System.out.print("예금액> ");
//				sum2 = sc2.nextInt();
//				balance = sum + sum2;
				sum = sc.nextInt();
				balance += sum;
			} else if (x == 2) {
				System.out.print("출금액> ");
//				sum2 = sc2.nextInt();
//				balance = sum - sum2;
				sum = sc.nextInt();
				balance -= sum;
			} else if (x == 3) {
				System.out.println("잔고> " + balance);
			} else if (x == 4) {
				break;
			} else {
				continue;
			}
			
		}
		
		System.out.println("프로그램 종료");
	}
}
