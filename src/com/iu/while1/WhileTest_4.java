package com.iu.while1;

import java.util.Scanner;

public class WhileTest_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bBuger=0;//수량 or 주문한 총가격
		int cBuger=0;//수량 or 주문한 총가격
		int potato=0;//수량 or 주문한 총가격
		int salad =0;//수량 or 주문한 총가격 
		int count=0;//수량
		int total=0;//총합계를 담을 변수
		boolean check=true;//반복문의 조건
		int select=0;
		do {
			System.out.println("햄버거 ***************");
			System.out.println("1. 불고기버거	3500원");
			System.out.println("2. 치킨버거	3200원");
			System.out.println("추가 ****************");
			System.out.println("3. 감자튀김	1000원");
			System.out.println("4. 샐러드		2000원");
			select = sc.nextInt();
			System.out.println("수량을 입력하세요");
			count=sc.nextInt();
			switch(select) {
			case 1:
				//불고기 버거 선택
				bBuger=bBuger+count*3500;
				break;
			case 2:
				//치킨 버거 선택
				cBuger=cBuger+count*3200;
				break;
			case 3:
				//감자튀김 선택
				potato=potato+count*1000;
				break;
			case 4:
				//샐러드 선택
				salad = potato+count*2000;
				break;
			}
			System.out.println("추가주문은 1. 아니면 0");
			select = sc.nextInt();
			/*if(select==0) {
				break;
			}*/
		}while(select != 0);
		
		// 최종 출력문
		// 최종 가격
		total = bBuger+cBuger+potato+salad;
		
		if(bBuger>0) {
			int p = bBuger/3500;
			System.out.println("불고기 : "+ p+ " 개 -- 가격 :"+bBuger);
		}
		
		if(cBuger>0) {
			int p = cBuger/3200;
			System.out.println("치킨 : "+ p+ " 개 -- 가격 :"+cBuger);
		}
		
		if(potato>0) {
			int p = potato/1000;
			System.out.println("감튀 : "+ p+ " 개 -- 가격 :"+potato);
		}
		
		if(salad>0) {
			int p = salad/2000;
			System.out.println("샐러드: "+ p+ " 개 -- 가격 :"+salad);
		}
		System.out.println("=======================");
		System.out.println("총 가격 : "+ total);

	}

}
