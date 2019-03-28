package com.iu.for1;

public class For_ex2 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				System.out.println("test");
				continue;
			}
			System.out.println(i);
		}
		
		int count = 5;
		for(int i=0;i<10;i++) {
			if(i==count) {
				break;
			}
			System.out.println(i);
		}

	}

}
