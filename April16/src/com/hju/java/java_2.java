package com.hju.java;

public class java_2 {

	public static void main(String[] args) {

		while (true) {
			int x = (int) (Math.random() * 6) + 1;
			int y = (int) (Math.random() * 6) + 1;
			
			if (x + y == 5) {
				System.out.println("(" + x + "," + y + ")");
				break;
			}
			
			System.out.println("(" + x + "," + y + ")");
		}
		
	}

}
