package com.velocity;

import java.util.ArrayList;

public class SecondMax {
	public static void main(String[] args) {
		int a[] = { 12, 65, 35, 65, 89, 56,11, 74, 65, 52, 10, 90 };
		int max = a[0];
		int max2 = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
}
	}
		for (int i = 0; i < a.length; i++) {
			if (max2 < a[i] & a[i] < max) {
				max2 = a[i];
			}
		}

		System.out.println(max);
		System.out.println(max2);
		System.out.println(max);
		
	}

}
