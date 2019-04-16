package com.hju.java;

public class java_6 {

	public static void main(String[] args) {
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					max = array[i];
					array[i] = array[j];
					array[j] = max;
				} 
				
			}
		}
		System.out.println("max : " + max);
	}

}
