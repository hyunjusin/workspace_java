package com.hju.java;

import java.util.Scanner;

public class Java_1 {
	
	// 학생 수 & 학생들 점수를 입력받아서, 최고 점수 및 평균 점수 구하기 
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
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if (selectNo == 1) {
				System.out.print("학생수> ");
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
				System.out.printf("최고점수 : %d점\n", scores[max]);
				System.out.printf("평균점수 : %d점\n", sum / studentNum);
				
			} else if (selectNo == 5) {
				run = false;
			}
		}
		sc.close();
		System.out.println("프로그램 종료");
	}

}
