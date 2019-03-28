package com.iu.for1;

import java.util.Scanner;

public class For_ex1 {

	public static void main(String[] args) {
		//1 부터 10까지의 합을 구하세요
		//0+1+2+3+4+5+...+10
		// int hap=0; hap = hap+1; hap = hap+2; hap = hap+3; hap = hap+10;
		//hap = hap+n
		/*
		int hap =0;
		int num=3;
		int count=20;
		for(int i=num;i<count;i++) {
			hap = hap+i;//누적함수
		}
		System.out.println(hap);
		*/
		
		//원하는 시간을 입력 10
		//초시계
		//0초 ~59초 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("초 입력");
		int sec = sc.nextInt();//5
		
		for(int i=0;i<60;i++) {
			System.out.println(i);
			if(i==sec) {
				System.out.println("OK");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		

	}

}
