package com.parthu;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		String s="parthu";
		List<String> l = Arrays.asList(s);
		l.stream().map(i->new StringBuilder(i).reverse()).forEach(i->System.out.println(i));
		
	}
}