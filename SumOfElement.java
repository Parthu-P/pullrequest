package com.parthu;

public class SumOfElement {
	public static void main(String[] args) {
		int[] a = { 11, 265, 33, 44, 66 };
		int sum = sumsumOfElement(a);
		System.out.println(sum);
	}

	private static int sumsumOfElement(int[] a) {
		int sumOf = 0;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			int b = a[i];
			while (b > 0) {
				int c = b % 10;
				sum += c;
				b /= 10;
			}
			if (sum % 2 != 0) {
				sumOf = sum;
			}
		}
		return sumOf;
	}
}
