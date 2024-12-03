package com.gn.homework.loop;

import java.util.Scanner;

public class Practice02 {
	Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
		
	public void practice02(){
=======
	
	public void practice01() {
		int sum=0;
		while (1==1) {
			System.out.print("정수 (1~50) : ");
			int so = sc.nextInt();
			if (so > 0) {
				for(int i =0; i <=so;i++) {
						
					if(i%2==0) {
						sum = sum + i;
					}
				}
				System.out.println(sum);
				break;
			}else {
			System.out.println("1~50 사이의 정수를 입력하세요. ");
			}
		}
	} // 01 종료
		public void practice02(){
>>>>>>> branch 'master' of https://github.com/tyk22/java_study.git
			
			//System.out.print("숫자 : ");
			int num =0;
			while(true) {
				System.out.print("숫자 : ");
				num = sc.nextInt();
				if(num==0) {
					System.out.println("종료 합니다. ");
					return;
				}else if(num<0) {
					System.out.println("양수만 입력해주세요. ");
				}
				else if(num<=9) {
					for(int i=1;i<=9;i++) {
						System.out.println(num+" * "+i+" = "+(num*i));
					}
				}else if(num>=10) {
					System.out.println("9 이하의 숫자만 입력해주세요. ");
				}
			}
<<<<<<< HEAD
		}
	public void practice03() {
		
		for(int i = 0; ; i++) {
			System.out.print("입력 : ");
			String hel = sc.nextLine();
			
			if(hel.equals("탈출")) {
				System.out.println("프로그램 종료");
				break;
			}
			for (int j = 0; j < hel.length();j++) {
			System.out.print(hel.charAt(j));
				}
			System.out.println();
			}
	}
	public void practice06() {
		
		System.out.println("    *    "); // 빈칸 4칸, * 1개
		System.out.println("   ***   "); // 빈칸 3칸, * 3개
		System.out.println("  *****  "); // 빈칸 2칸, * 5개
		System.out.println(" ******* "); // 빈칸 1칸, * 7개
		System.out.println("*********"); // 빈칸 0칸, * 9개
		
		for(int i = 0; i>10;i++) {
			for(int j = 4;j<=0;j--) {
				System.out.println(" ");
			}
			System.out.println("*");
		}
	}
	public void practice07() {
		
		System.out.println("정수 : ");
		int jong = sc.nextInt();
		
	}
}
=======
		} // 02 종료
>>>>>>> branch 'master' of https://github.com/tyk22/java_study.git
		
		public void practice04() {
			do {
				System.out.println("게임을 실행합니다!");
				System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
				String yes = sc.next();
				
				if(yes.equals("no")){
					System.out.println("게임을 종료합니다. ");
					break;
				}
			}while(true);
		}// 04 종료
		
		public void practice05() {
			int sum = 0;
			while(true) {
				System.out.print("숫자(0을 입력하면 종료) :");
				int so = sc.nextInt();
				if ( so > 0) {
					sum=sum+so;
				}else if( so == 0) {
					System.out.print("양수의 합계 : "+sum);
					break;
				}
			}
		}// 05 종료
		
		public void practice07() {

			while (true) {
				System.out.print("정수 : ");
				int ju = sc.nextInt();  
				if(ju>0) {
					for(int i=0;i<ju;i++) {
					if(i%2==0) {
						System.out.print("박");
					}else if (i%2==1){
						System.out.print("수");
					}
					}
					break;
				}else {
					System.out.println("양수가 아닙니다. ");
				}
			}	
		} // 07 종료
	public void practice08() {
//		문자열 : application
//		문자 : a
//		포함된 개수 : 2	
//		다시 입력하시겠습니까? : y
//		문자열 : business
//		문자 : s
//		포함된 개수 : 3
//		다시 입력하시겠습니까? : k
//		잘못된 대답입니다. 다시 입력해주세요.
//		다시 입력하시겠습니까? : Y
//		문자열 : ant
//		문자 : b
//		포함된 개수 : 0
//		다시 입력하시겠습니까? : N
		
		while(true) {
			System.out.print("문자열 : ");
			String str = sc.next();
			
			System.out.print("문자 : ");
			String mon = sc.next();
			
			// str.charAt(i)==mon.charAt(0)
		}
	}
	
	
}

