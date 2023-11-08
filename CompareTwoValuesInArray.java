package com.parthu;

import java.util.Arrays;

public class CompareTwoValuesInArray {

	public static void main(String[] args) {

		Integer[] a= {-1,-1,-3,4,-6,-6,-8,9,-10};
		//[1,1,4,3,6,6,9,8,10]
		for(int i=0;i<a.length;i+=2) {
			for(int j=i+1;j<i+2 && j<a.length;) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				break;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
