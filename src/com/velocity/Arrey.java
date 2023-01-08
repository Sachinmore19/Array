package com.velocity;

import javax.jws.soap.SOAPBinding;

public class Arrey {
	public static void main(String[] args) {
		//array
		
		int a[]=new int [5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		int []b= {10,25,62,40};
		System.out.println(b[2]);
		System.out.println("................for loop....................");
		// print a array ussing for loop
		for (int i=0;i< a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("...............for each loop......................");
		
		for(int j:a) {
			System.out.println(j);
		}
		
		System.out.println("................max number...................");
		int []c=  {10,45,65,88,42,87};
		int max=c[0];
		//System.out.println(c.length);
		for (int i=0; i<c.length;i++) {
			
			if (c[i]>max){
				max=c[i];
			}
		}
		
		
		
		
		
		
		
		
		
		System.out.println(max);
	System.out.println(".................min number................................");
		
	
		int d []= {15,45,85,44,40,30,85,25,45,36,10,11,1};
		int min=d[0];
		System.out.println("d length>>"+d.length);
		
		//                  12
		for (int k=0; k<d.length;k++) {
			if(min>d[k]) {//15>45
				min=d[k];
			}
		}
		System.out.println("minimum number"+min);
		
		
		System.out.println("this is the maximum number");
		
		
		
	}
	
	
	

}
