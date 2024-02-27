package com.nt.main;

import com.nt.service.ArithmeticOperations;

public class AppTest{

	public static void main(String[] args) {
		ArithmeticOperations ar=new ArithmeticOperations();
		System.out.println("sum:"+ar.sum(100, 200));
		System.out.println("sub:"+ar.sub(100, 200));
		System.out.println("------------------");
		
	}

}
