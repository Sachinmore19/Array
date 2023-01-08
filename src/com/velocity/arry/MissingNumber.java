package com.velocity.arry;

import java.io.Serializable;

public class MissingNumber {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				// if( 1+(a[i])==a[j]) {
				System.out.println("missing number" + a[j]);

				// }
			}
		}

	}
}