package com.hju.java;

public class Java_2 {
	
	// ����ó�� � ������ �߻��ϴ��� ����
	public static void main(String[] args) {
		String[] array = {"10", "2a"};
		int value = 0;
		
		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(array[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε����� �ʰ�����");
			} catch (NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ�� �� ����");
			} finally {
				System.out.println(value);
			}
		}
	}
}
