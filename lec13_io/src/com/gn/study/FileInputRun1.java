package com.gn.study;

import java.io.File;
import java.io.FileInputStream;

public class FileInputRun1 {

	public static void main(String[] args) {
		// 1. 파일 위치 지정
		File dir = new File("C:\\test\\sub");
		File file = new File(dir,"sample1.dat");
		// 2. 파일 입력 스트림 선언
		FileInputStream in = null;
		// 3. 파일 입력 스트림 생성
		try {
			in = new FileInputStream(file);
			// 4. 읽은 데이터를 보관할 배열
			// (1) 파일 크기만한 비어있는 바이트형 배열
			byte[] b = new byte[(int)file.length()];
			int idx = 0;
			// 5. 읽어오기
			// (2) 읽어올 데이터 담을 변수
			int c;
			// (3) 반복문으로 파일 내부 정보 읽어옴
			while ( true ) {
				c=in.read();
				if(c==-1) break;
				b[idx++]=(byte)c;
			}
			// 6. 확인하기
			System.out.println(b);
			String str = new String(b);
			System.out.println(str);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 7. 닫아주기
			try {
				if(in != null)in.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
