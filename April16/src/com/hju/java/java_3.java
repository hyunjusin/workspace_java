package com.hju.java;

public class java_3 {
	
	// x, y <= 10 & 4x + 5y = 60의 해 구하기
	
	public static void main(String[] args) {
		
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				
				if (4 * x + 5 * y == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
		
	}

}
