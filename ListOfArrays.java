package com.parthu;

import java.util.ArrayList;
import java.util.List;

public class ListOfArrays {

	public static void main(String[] args) {

		Object[] array = { 1, 2, new Object[] { 3, 4, new Object[] { 5 }, 6, 7 }, 8, 9, 10 };
		List<Object> flatenArray = flatenArray(array);
		System.out.println(flatenArray);

	}

	private static List<Object> flatenArray(Object[] array) {
        List<Object> al = new ArrayList<>();
        for (Object item : array) {
            if (item instanceof Object[]) {
                al.addAll(flatenArray((Object[]) item));
            } else {
                al.add(item);
            }
        }
        return al;
    }

}
