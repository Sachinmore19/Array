package com.velocity;

import java.io.FileInputStream;
import java.util.Properties;

public class Property {
	
	public static void main(String[] args) {
		try {
		FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Sam.properties");
		Properties p=new Properties();
		p.load(fis);
		System.out.println(p.getProperty("username"));
		String pass=p.getProperty("password");
		System.out.println(pass);
		}catch(Exception e){
			e.printStackTrace();
			
			
			
		}
		
		
	}

}
