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
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------");
			System.out.print("����> ");
			
			x = sc.nextInt();
			
			if (x == 1) {
				System.out.print("���ݾ�> ");
//				sum2 = sc2.nextInt();
//				balance = sum + sum2;
				sum = sc.nextInt();
				balance += sum;
			} else if (x == 2) {
				System.out.print("��ݾ�> ");
//				sum2 = sc2.nextInt();
//				balance = sum - sum2;
				sum = sc.nextInt();
				balance -= sum;
			} else if (x == 3) {
				System.out.println("�ܰ�> " + balance);
			} else if (x == 4) {
				break;
			} else {
				continue;
			}
			
		}
		
		System.out.println("���α׷� ����");
	}
}
