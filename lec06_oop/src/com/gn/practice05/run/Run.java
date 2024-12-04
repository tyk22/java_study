package com.gn.practice05.run;

import com.gn.practice05.model.vo.Book;

public class Run {

	public static void main(String[] args) {

		Book book = new Book();
		
		book.information();
		book.Book("홍길동전", 5000, "허균");
		book.information();
		book.Book("채소 과일 레시피", "박경희", "터치아트", 19300, 0.1);
		book.information();
	}

}
