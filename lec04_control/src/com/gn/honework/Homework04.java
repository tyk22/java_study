package com.gn.honework;
import java.util.Scanner;
public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*=== 합격인가? 불합격인가? ===
		각 과목의 점수를 입력하세요.
		소프트웨어설계 점수: 73
		소프트웨어개발 점수: 51
		데이터베이스구축 점수: 65
		프로그래밍언어활용 점수: 80
		정보시스템구축관리 점수: 42
		합격을 축하합니다!*/ // 각 과목당 40점 이상은 돼야함 - 평균은 60점 이상, - 불합격시 이유(과목_)
		System.out.println("=== 합격인가? 불합격인가? ===");
		System.out.println("각 과목의 점수를 입력하세요.");
		
		String fail = "";
		
		System.out.print("소프트웨어설계 점수: ");
		int soft1 = sc.nextInt();
		
		
		System.out.print("소프트웨어개발 점수: ");
		int soft2 = sc.nextInt();
		
		System.out.print("데이터베이스구축 점수: ");
		int dtdg = sc.nextInt();
		
		
		System.out.print("프로그래밍언어활용 점수: ");
		int porg = sc.nextInt();
		
		
		System.out.print("정보시스템구축관리 점수: ");
		int jo = sc.nextInt();
		
		
		int same = 0;
		
		
		if ( soft1 >= 40) {
			same = soft1 + same;
		}else {
			fail += "소프트웨어 설계 ";
		}
		
		if ( soft2>=40) {
			same = soft2 + same;
		}else {
			// sof2= "소프트웨어개발 ";
			fail+= "소프트웨어 개발";
		}
		
		if(dtdg>=40) {
			same = dtdg + same;
		}else {
			fail+="데이터베이스구축 ";
		}
		
		if(porg>=40) {
			same = porg + same;
		}else {
			fail+="프로그래밍언어활용 ";
		}
		if(jo>=40) {
			same = jo + same;
		}else {
			fail+="정보시스템구축관리 ";
		}
		
		
		
		if(soft1>=40 && soft2>=40 && dtdg>=40&&porg>=40&&jo>=40) {
			if( same/5 >=60 ) {
				System.out.println("합격을 축하합니다!");
			}else {
				System.out.println("평균 점수 60점 미만으로 불합격입니다. ");
			}
		}else {
			//과락 있음
			System.out.print(fail+"과목 과락으로 불합격입니다");
		}
		
		
	}
}
