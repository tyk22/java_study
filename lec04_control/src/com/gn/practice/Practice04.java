package com.gn.practice;
import java.util.Scanner;
public class Practice04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		/* 0 : 조명을 끕니다.
		1 : 어두운 조명입니다.
		2 : 밝은 조명입니다.
		3 : 매우 밝은 조명입니다.
		입력 값이 위의 기준에 해당하지 않으면 “올바른 입력이 아닙니다.”라고 출력하세요.
		2) 출력 예시
		조명의 밝기를 입력하세요 (0~3): **3**
		현재 조명의 밝기: 매우 밝은 조명입니다.*/
		System.out.print("조명의 밝기를 입력하세요 (0~3): ");
		int jo = sc.nextInt();
		String c ="";
		if(jo>4) {
			System.out.println("올바른 입력이 아닙니다. ");
		}else if(jo==0){
			System.out.println("조명을 끕니다. ");
		}else {
			switch(jo) {
			case 0: 
			break;
			
			case 1: c="어두운 ";
			break;
			
			case 2:  c="밝은 ";
			break;
			
			case 3: c="매우 밝은 ";
			break;
			
			default : 
			break;
		}
			System.out.println(c+"조명입니다. ");
		
		switch(jo) {
			case 0: System.out.println("조명을 끕니다. ");
			break;
			
			case 1: System.out.println("어두운 조명입니다. ");
			break;
			
			case 2: System.out.println("밝은 조명입니다.");
			break;
			
			case 3: System.out.println("매우 밝은 조명입니다. ");
			break;
			
			default : System.out.println("올바른 입력이 아닙니다. ");
			break;
		}
		/*switch(jo) {
		case 0: System.out.println("조명을 끕니다. ");
		break;
		
		case 1: c="어두운 ";
		break;
		
		case 2: c="밝은 ";
		break;
		
		case 3: c="매우밝은 ";
		break;
		
		default : System.out.println("올바른 입력이 아닙니다. ");
		break;
	}
		System.out.println(c+"조명입니다. ");
	}*/
		
}
}
	
}
