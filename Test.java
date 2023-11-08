package com.parthu;

import java.lang.reflect.Constructor;

public class Test {

	public static void main(String[] args) throws Exception {
		Singledemo s = Singledemo.getInstance();
		System.out.println(s.hashCode());
		
		Singledemo s1 = Singledemo.getInstance();
		System.out.println(s1.hashCode());
		
		Constructor<Singledemo> rs = Singledemo.class.getDeclaredConstructor();
		rs.setAccessible(true);
		Singledemo s2 = rs.newInstance();
		System.out.println(s2.hashCode());

	}

}
