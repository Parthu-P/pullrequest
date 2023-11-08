package com.parthu;

import java.util.ArrayList;
import java.util.List;

public class ArraySplit {

	public static void main(String[] args) {

		Integer[] a = { 1, 2, 3, 4, 5, 3, 4, 5, 6, 8 };
		int size = 3;
		List<List<Integer>> list = arraySplit(a, size);
		System.out.println(list);
	}

	private static List<List<Integer>> arraySplit(Integer[] a, int size) {

		List<List<Integer>> l = new ArrayList<>();
		for (int i = 0; i < a.length; i += size) {

			List<Integer> al = new ArrayList<>();
			for (int j = i; j < (Math.min(i + size, a.length)); j++) {

				al.add(a[j]);
			}
			l.add(al);
		}
		return l;

		// without using math

		/*
		 * List<List<Integer>> b = new ArrayList<>(); int s = 3;
		 * 
		 * int i = 0; while (i < a.length) {
		 * 
		 * List<Integer> al = new ArrayList<>(); for (int j = i; j < i + s && j <
		 * a.length; j++) { al.add(a[j]); } b.add(al); i += s; } System.out.println(b);
		 */

	}

}
