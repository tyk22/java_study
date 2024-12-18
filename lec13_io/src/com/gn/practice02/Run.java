package com.gn.practice02;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
public class Run {

	public static void main(String[] args) {
		File file = new File("C:\\test\\sub");
		String uuid = UUID.randomUUID().toString();
		uuid = uuid.replace("-", "");
		uuid+=".txt";
		File file2 = new File("C:\\test\\sub\\"+uuid);
		try {
			if(!file.exists()) {
				file.mkdirs();
		}
			if(file2.createNewFile()) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
