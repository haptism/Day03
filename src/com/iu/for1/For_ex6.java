package com.iu.for1;

import java.util.Scanner;

public class For_ex6 {

	public static void main(String[] args) {
		//분 과 초
		//0분 0초
		//0분 1초
		//0분 2초
		//0분 59초
		//1분 0초
		//59분 59초
		// 분과 초를 입력//1분 12초
		Scanner sc = new Scanner(System.in);
		System.out.println("분을 입력");
		int min = sc.nextInt();
		System.out.println("초를 입력");
		int sec = sc.nextInt();
		boolean check=false;
		for(int i =0;i<60;i++) {
			for(int j=0;j<60;j++) {
				System.out.println(i+" 분 "+j +" 초");
				if(i==min&&j==sec) {
					check=!check;
					break;
				}
			}//안쪽 for
			if(check) {
				break;
			}
		}//바깥 for
		System.out.println("종료");
	}

}







