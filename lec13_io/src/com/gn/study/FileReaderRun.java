package com.gn.study;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderRun {

	public static void main(String[] args) {
		// 1. 디렉토리, 파일 생성
		File dir = new File ("C:\\test\\sub\\sample1.txt");
		// 2. 파일 입력 스트림 선언(텍스트)
		FileReader fr = null;
		try {
			// 3. 파일 입력 ㅅ트림 생성
			fr= new FileReader(dir);
			
			// 4. 읽을 단위 지정 > int, char[]
			
			StringBuilder sb = new StringBuilder();
			/* 1) int
			while(0==0) {
				int data = fr.read();
				if(data ==-1)break;
				sb.append((char)data);
			}*/
			// char[] 
			char[] std = new char[3];
			while(true) {
				int data = fr.read(std);
				if(data == -1)break;
				sb.append(std, 0, data);
			}
			
			System.out.println(sb.toString());
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null)fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
