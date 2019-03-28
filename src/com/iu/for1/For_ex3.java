package com.iu.for1;

import java.util.Scanner;

public class For_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//id, pw
		int id=1234;
		int pw=5678;
		boolean check=false;
		String result="은행을 방문 하세요";
		for(int i=0;i<5;i++) {
			System.out.println("id 입력");
			int yId = sc.nextInt();
			System.out.println("pw 입력");
			int yPw = sc.nextInt();
			
			if(yId==id && yPw == pw) {
				check=!check;
				result="로그인 성공";
				break;
			}
		}
		
		System.out.println(result);

		if(check) {
			
			//1. 계좌조회
			//2. 계좌이체
			//3. 대     출
			System.out.println("1.계좌조회");
			System.out.println("2.계좌이체");
			System.out.println("3.대     출");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("계좌조회 중");	
				break;
			case 2:
				System.out.println("계좌이체 중");
			default:
				System.out.println("대출 중");
			}
		}
		
		//로그인 성공, 은행방문 하세요
		
		

	}

}
