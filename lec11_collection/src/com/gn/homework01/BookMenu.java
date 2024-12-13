package com.gn.homework01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		// === 가남 도서관에 오신걸 환영합니다 ===
		  // 원하시는 업무의 번호를 선택하세요.
		  // 1. 새 도서 추가 -> insertBook() 호출
		  // 2. 도서 전체 조회 -> selectList() 호출
		  // 3. 도서 검색 조회 -> searchBook() 호출
		  // 4. 도서 삭제 -> deleteBook() 호출
		  // 5. 도서 오름차순 정렬 -> ascBook() 호출
    // 9. 종료 -> "프로그램을 종료합니다." 출력 후 종료
    // 메뉴 선택 : 
    // 숫자 입력 받아서 기능 수행하기
    // 만일 1,2,3,4,5,9 외의 숫자 입력하면 -> "잘못 입력하였습니다. 다시 입력해주세요." 출력
		
		
		while(true) {
			System.out.println("// === 가남 도서관에 오신걸 환영합니다 ===");
			System.out.println("원하시는 업무의 번호를 선택하세요.");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 오름차순 정렬");
			System.out.println("9. 종료");
			
		System.out.print("메뉴 선택 :");
		int nume = sc.nextInt();
		switch(nume) {
		case 1 : insertBook();break;
		case 2 : selectList();break;
		case 3 : searchBook();break;
		case 4 : deleteBook();break;
		case 5 : ascBook();break;
		case 9 : System.out.println("프로그램을 종료합니다.");break;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			continue;
		}
	}	
	
}
	public void insertBook() {
		System.out.print("도서명 : ");
		String title = sc.next();
		System.out.print("저자명 : ");
		String author = sc.next();
		System.out.println("(1:인문 / 2:자연과학 / 3:어린이 / 그 외:기타)");
		System.out.print("장르 : ");
		int category = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();

		String catego = "";
		if(category==1) {
			catego="인문";
		}else if(category==2) {
			catego="자연과학";
		}else if(category==3) {
			catego="어린이";
		}else {
			catego="기타";
		}
		Book b = new Book(title, author, catego, price);
		bc.insertBook(b);
	}
	public void selectList() {
		System.out.println("===전체 조회===");
		List<Book> bl = bc.selectList();
		// bc.selectList();	
		//List<Book> bc =new ArrayList<Book>(bl);
		if(bl.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다. ");
		}else {
			for(Book b:bl) {
				System.out.println(b);
			}
		}
			/*for(int i = 0; i <bc.size();i++) {
				System.out.println(bc.get(i));
			}
		}else {
			System.out.println("존재하는 도서가 없습니다.");
		}*/
	}
	public void searchBook() {
		
	}
	public void deleteBook() {
		
	}
	public void ascBook() {
		
	}
	
	
}
