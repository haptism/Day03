package com.iu.while1;

import java.util.Scanner;

public class WhileTest_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		
		while(true) {
			//1.로그인?
			//2. 종료?
			
			System.out.println("id 입력");
			int yId = sc.nextInt();
			System.out.println("pw 입력");
			int yPw = sc.nextInt();
			if(yId==id&&yPw==pw) {
				System.out.println("로그인 성공");
				break;
			}
		}
				
				

	}

}
