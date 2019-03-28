package com.iu.while1;

import java.util.Scanner;

public class WhileTest_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//로그인 파트
		int id = 1234;
		int pw = 5678;
		boolean check = true;
		int level=0;//레벨을 담을 변수
		int gold=0;//gold를 담을 변수
		int mon=3;//몬스터 수
		
		
		while(check) {
			System.out.println("1. 로그인");
			System.out.println("2. 종   료");
			int select = sc.nextInt();
			if(select == 1) {
				//로그인 진행 코드
				System.out.println("id를 입력");
				int yId = sc.nextInt();
				System.out.println("pw를 입력");
				int yPw = sc.nextInt();
				
				if(yId==id && yPw==pw) {
					System.out.println("로그인 성공");
					//check=!check;
					break;
				}else {
					System.out.println("로그인 실패");
				}
				
				
			}else {
				//break;
				check=!check;
			}
		}//while End
		
		//겜 파트 진행
		//check F-> 로그인 성공, T - 로그인 실패
		if(check) {// check==false
			for(level=1;level<15;level++) {
				if(level==5 || level==10) {
					gold=gold+ level/5*1000;
					System.out.println(level/5*1000+" Gold 지급");
				}
				
				
				for(int i=1;i<=level*3;i++) {
					System.out.println(i + "번째 사냥 성공");
				}
				System.out.println("축 레벨업!! "+ (level+1));
			}
			gold = gold+3000;
			System.out.println("현재 래밸 : "+level);
			System.out.println("Gold   : "+gold);
			
		}
		
		System.out.println("프로그램을 종료");
		
		

	}

}
