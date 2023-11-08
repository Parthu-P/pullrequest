package com.parthu;

import java.util.Arrays;
import java.util.List;

public class MultiDemo {

	public static void main(String[] args) {

		List<String> a = Arrays.asList("hi","hello");
		List<String> b = Arrays.asList("hi","hello");
		List<List<String>> ab = Arrays.asList(a,b);
		List<String> list = ab.stream().distinct().flatMap(i->i.stream()).toList();
		System.out.println(list);
		
	}
}
