package com.gn.practice01;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {

	public static void main(String[] args) {
		Practice p = new Practice();
		LocalDate dau = LocalDate.now();

		DateTimeFormatter ter = DateTimeFormatter.ofPattern("\\yyyy\\MM\\dd");
		File fast = new File("C:\\test\\sub");
		File fi = new File("C:\\test\\sub"+dau.format(ter));
		fast.mkdirs();
		if(fast.exists()) {
			if(fi.mkdirs()) {
				System.out.println("디렉토리 생성 성공");
			}else {
				System.out.println("실패");
			}
		}else {
			System.out.println("이미 존재하는 디렉토리");
		}
		p.deleteFile(fast);
	}

}
