package com.parthu;

import java.util.ArrayList;
import java.util.List;

public class ListOfArrays1 {

	public static void main(String[] args) {

		Object[] a = { 1, 2, 3, new Integer[] { 4, 5, 6 }, 9, new Integer[] { 10, 11, 12 }, 14, 15,
				new Integer[] { 90 }, 97, 98, new String[] { "parthu" } };
		
		List<Object> al = new ArrayList<>();
		
		for(Object item : a) {
			if(item instanceof Object[]) {
				for(Object element:(Object[])item) {
					al.add(element);
				}
			}else {
				al.add(item);
			}
		}
		System.out.println(al);
	}
}
