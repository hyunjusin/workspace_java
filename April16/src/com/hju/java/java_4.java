package com.hju.java;

public class java_4 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 0; i <= 9; i++) {
				if (i == 0) {
					System.out.print(dan + "´Ü");
				}
				else {
					System.out.print(dan * i);
				}
				System.out.println();
			}
		}
	}

}
