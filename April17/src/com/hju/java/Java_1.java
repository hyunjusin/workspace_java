package com.hju.java;

import java.util.Scanner;

public class Java_1 {
	
	// �л� �� & �л��� ������ �Է¹޾Ƽ�, �ְ� ���� �� ��� ���� ���ϱ� 
	@SuppressWarnings("null")
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int max = 0;
		int sum = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------------------");
			System.out.print("����> ");
			
			int selectNo = sc.nextInt();
			
			if (selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length ; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = sc.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			} else if (selectNo == 4) {
				
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				for (int i = 0; i < scores.length; i++) {
					if (scores[i] > scores[max]) {
						max = i;
					} 
				}
				System.out.printf("�ְ����� : %d��\n", scores[max]);
				System.out.printf("������� : %d��\n", sum / studentNum);
				
			} else if (selectNo == 5) {
				run = false;
			}
		}
		sc.close();
		System.out.println("���α׷� ����");
	}

}
